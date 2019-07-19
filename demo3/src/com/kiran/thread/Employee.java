package com.kiran.thread;

public class Employee {

	private int eid;
	private String ename;
	private String email;

	public int getEid() {
		return eid;
	}

	public Employee(int eid, String ename, String email) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
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

	synchronized public void myMrthod() {
		for (int i = 0; i < 10; i++) {
			System.out.println("operation started " + Thread.currentThread() + i);
		}
	}
}
