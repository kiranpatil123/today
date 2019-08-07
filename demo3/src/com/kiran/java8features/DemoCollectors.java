package com.kiran.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Driver {
	private int did;
	private String dname;

	public Driver(int did, String dname, String dmail) {
		super();
		this.did = did;
		this.dname = dname;
		this.dmail = dmail;
	}

	private String dmail;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDmail() {
		return dmail;
	}

	public void setDmail(String dmail) {
		this.dmail = dmail;
	}

}

public class DemoCollectors {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("server:port");
		list.add("list:port");
		list.add("application:name");

		Map<String, String> map = list.stream().map(str -> str.split(":"))
				.collect(Collectors.toMap(str -> str[0], str -> str[1]));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		map.forEach((key, value) -> {
			System.out.println(key + ":" + value);
		});

		List<Driver> list2 = new ArrayList<>();
		list2.add(new Driver(1, "kiran", "patil@gmail.com"));
		list2.add(new Driver(2, "patil", "kiran@gmail.com"));
		list2.add(new Driver(3, "Ravi", "ravi@gmail.com"));
		list2.add(new Driver(2, "patil", "charan@gmail.com"));

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Map<String, String> map2 = list2.stream().filter(driver -> driver.getDid() > 1).collect(Collectors
				.toMap(driver -> driver.getDname(), driver -> driver.getDmail(), (oldValue, newValue) -> newValue));
		map2.forEach((key, value) -> {
			System.out.println(key + ":" + value);
		});
	}

}
