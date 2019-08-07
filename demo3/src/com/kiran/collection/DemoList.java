package com.kiran.collection;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class Employee {
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

	public Employee(int eid, String ename, String email) {
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

public class DemoList {

	public static void main(String[] args) {
//		System.out.println(2 << 2);
//		System.out.println(0.75*16);
		int a=(int)(0.75*16);
		System.out.println(a);
		
		/*
		 * ConcurrentHashMap< String, String> concurrentHashMap=new
		 * ConcurrentHashMap<>(); concurrentHashMap.put(null, null);
		 * System.out.println(concurrentHashMap);
		 */
		/*
		 * Hashtable<String, String> hashtable=new Hashtable<>(); hashtable.put(null,
		 * null); System.out.println(hashtable);
		 */
		/*
		 * List<? extends Number> list = new ArrayList<>();
		 * 
		 * 
		 * 
		 * list.add(new Integer(3)); list.add(new Integer(2)); list.add(new
		 * Double(4.0));
		 * 
		 * List<Integer> list1 = new ArrayList<>(); list1.add(2); list1.add(3);
		 * 
		 * list=list1;
		 * 
		 * List<String> list2 = new ArrayList<>(); list2.add("2"); list2.add("3");
		 */
		/*
		 * List list3=new ArrayList(); list3.add("hi"); list3.add(3);
		 * System.out.println(list3);
		 */

//		list=list2;

//		list = list1;
//		System.out.println(list);

		/*
		 * list.add("kiran"); list.add("patil"); list.add("hello");
		 */

		/*
		 * for (String s1 : list) { s1 = "Naya"; list.add("lplp"); // It gives
		 * concurrent thread modification exception System.out.println(s1);
		 * 
		 * }
		 */
		/*
		 * List<Employee> employeesList = new ArrayList<>(); boolean add =
		 * employeesList.add(new Employee(1, "kiran", "patil")); employeesList.add(new
		 * Employee(1, "kiran", "patil"));
		 * 
		 * for (Employee emp : employeesList) { System.out.println(emp); }
		 */

		/*
		 * LinkedList<String> list1 = new LinkedList<>(); boolean b = list1.add("hi");
		 * 
		 * System.out.println(b);
		 */
	}

}
