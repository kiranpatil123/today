package com.kiran.wrapper;

class DemoInt {

	/*
	 * public void myMethod(int a) {
	 * System.out.println("Inside int block >>>>>"+"\t"+ + a); }
	 */

	/*
	 * public void myMethod(long l) {
	 * System.out.println("Inside long block >>>>>"+"\t"+ + l); }
	 */

	/*
	 * public void myMethod(Integer a) {
	 * System.out.println("Inside integer block >>>>>" + "\t" + a); }
	 */
	

	public void myMethod(Number d) {
		System.out.println("Inside Number block >>>>>"+" "+ d);
	}

	public void myMethod(Double d) {
		System.out.println("Inside double block >>>>>" + "\t" + d);
	}

}

public class DemoWrapper {
	public static void main(String[] args) {
		DemoInt demoInt = new DemoInt();
		int a = 80;
		demoInt.myMethod(a);
	}
}
