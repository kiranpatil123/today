/*
 * package com.example.demo;
 * 
 * import java.time.LocalDateTime;
 * 
 * import javax.transaction.Transactional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.scheduling.annotation.Scheduled; import
 * org.springframework.stereotype.Service;
 * 
 * @Service
 * 
 * @Transactional public class ScheduleService {
 * 
 * @Autowired private EmployeeRepository employeeRepository;
 * 
 * @Scheduled(fixedRate=2000) public void myScheduleService() {
 * System.out.println("scheduler is started "+LocalDateTime.now());
 * 
 * Employee emp=new Employee(); emp.setEname("kiran");
 * emp.setEmail("kiran_patil@gmail.com");
 * 
 * employeeRepository.save(emp); } }
 */