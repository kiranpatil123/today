package com.kiran.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Teacher implements Comparable<Teacher> {

	private Integer tid;
	private String tname;

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public int compareTo(Teacher o) {
		// TODO Auto-generated method stub
//		return this.getTid().compareTo(o.getTid());
		return this.getTname().compareTo(o.getTname());
	}

}

public class DemoComaparable {
	public static void main(String[] args) {

		/*
		 * List<String> list=new ArrayList<>();
		 * 
		 * list.add("kiran"); list.add("patil"); list.add("Navya");
		 * 
		 * Collections.sort(list);
		 * 
		 * for(String s1:list) { System.out.println(s1); }
		 */

		List<Teacher> list = new ArrayList<>();

		Teacher t3 = new Teacher();
		t3.setTid(3);
		t3.setTname("laxmi");

		Teacher t1 = new Teacher();
		t1.setTid(1);
		t1.setTname("kiran");

		Teacher t2 = new Teacher();
		t2.setTid(2);
		t2.setTname("patil");

		
		list.add(t1);
		list.add(t2);
		list.add(t3);

		Collections.sort(list/* ,Collections.reverseOrder() */);

		for (Teacher teacher : list) {
			System.out.println(teacher.getTname());
		}

	}
}
