package com.kiran.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Teacher {

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [tid=");
		builder.append(tid);
		builder.append(", tname=");
		builder.append(tname);
		builder.append("]");
		return builder.toString();
	}

	public void setTname(String tname) {
		this.tname = tname;
	}
}

class IdComparator implements Comparator<Teacher> {

	@Override
	public int compare(Teacher o1, Teacher o2) {

		return o1.getTid().compareTo(o2.getTid());
	}

}

class NameComparator implements Comparator<Teacher> {

	@Override
	public int compare(Teacher o1, Teacher o2) {
		// TODO Auto-generated method stub
		return o1.getTname().compareTo(o2.getTname());
	}

}

public class DemoComparator {
	public static void main(String[] args) {

		Teacher t1 = new Teacher();
		t1.setTid(1);
		t1.setTname("Manjunath");

		Teacher t2 = new Teacher();
		t2.setTid(2);
		t2.setTname("Kiran");

		Teacher t3 = new Teacher();
		t3.setTid(3);
		t3.setTname("Patil");

		List<Teacher> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);

		Collections.sort(list, new IdComparator());

		System.out.println("<<<<<<<< List before sorting >>>>>>>>> ");
		
		for (Teacher teacher : list) {
			System.out.println(teacher.getTid());
//			System.out.println(teacher.getTname());
		}

		
		
		Collections.sort(list, new NameComparator());
		
		System.out.println("<<<<<<<<<< List after sorting >>>>>>>>> ");

		for (Teacher teacher : list) {
			System.out.println(teacher.getTname());
		}

	}
}
