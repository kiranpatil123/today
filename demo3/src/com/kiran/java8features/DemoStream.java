package com.kiran.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	private int eid;
	private String ename;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [eid=");
		builder.append(eid);
		builder.append(", ename=");
		builder.append(ename);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;

	public Employee(int eid, String ename, String email) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
	}
}

public class DemoStream {

	public static void main(String[] args) {

		/* Stream iteration using builder */
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "kiran", "kiran5@gmail.com"));
		list.add(new Employee(2, "kiran1", "kiran4@gmail.com"));
		list.add(new Employee(3, "kiran2", "kiran3@gmail.com"));
		list.add(new Employee(4, "kiran3", "kiran2@gmail.com"));
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(1);
		list1.add(2);
		
		
		
		List<Integer> list2 = list1.stream().sorted().collect(Collectors.toList());
		
		for(Integer s1:list2) {
			System.out.println(s1);
		}
		
		List<Employee> collect = list.stream().filter(emp->emp.getEname().equals("kiran1")).collect(Collectors.toList());
		long count = list.stream().filter((emp)->{return emp.getEname().equals("kiran2");}).count();
		System.out.println("length "+count);
		for(Employee emp:collect) {
			System.out.println(emp);
		}
		  
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> findFirst = stream.limit(3).findFirst();
		System.out.println(findFirst.isPresent());
	
		Object[] array = stream.limit(3).toArray();
		long count2 = stream.limit(5).count();
		System.out.println("second count "+count2);
		
		
		
	}

}
