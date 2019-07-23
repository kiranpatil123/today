package com.kiran.collection;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Employee1 {
	private int eid;
	private String ename;
	private String email;

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

	public Employee1(int eid, String ename, String email) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

public class DemoConcurrentHashMapAndArrayList {

	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<>();
		list.add("kiran");
		list.add("patil");
		list.add("lasya");

		System.out.println(list.size());

		String string = list.get(2);
		list.sort(Comparator.naturalOrder());

		list.sort(Comparator.reverseOrder());

		System.out.println("index " + string);

		for (String s1 : list) {
			list.add("s2");
			System.out.println(s1);
		}

		for (String s3 : list) {
			System.out.println(s3);
		}

		List<Employee1> employeeList = new CopyOnWriteArrayList<>();
		employeeList.add(new Employee1(1, "kiran", "patil"));
		employeeList.add(new Employee1(1, "kiran1", "patil1"));
		employeeList.add(new Employee1(1, "kiran2", "patil2"));

		for (Employee1 emp : employeeList) {
			if (emp.getEname().equals("kiran2")) {
				emp.setEname("Nirmala");
			}
//			System.out.println(emp);
		}
		for (Employee1 emp : employeeList) {
			System.out.println(emp);
//			emp.setEmail("Nirmala");
		}

	}

}
