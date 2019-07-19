package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class UserController {

	@Autowired
	public UserRepository userRepository;

	@PostMapping("/create")
	
	public String createUser(@RequestBody UserBean userBean) {
		User user = new User();
		user.setUname(userBean.getUname());
		userRepository.save(user);
		return "User is successfully added";

	}

	@CachePut(value="usersCache")
	//@Cacheable(value = "usersCache", key = "9378")
	@GetMapping("/getAll")
	public List<User> getAllUser() {
		System.out.println("get all the details");
		return userRepository.findAll();
	}

	@CacheEvict(value = "usersCache", allEntries = true)
	@GetMapping("/getuncacheduser")
	public List<User> getUnCachedUser() {
		return userRepository.findAll();
	}
}
