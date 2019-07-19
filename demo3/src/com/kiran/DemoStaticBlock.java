package com.kiran;

class A {

	/*
	 * static void methodOne() { System.out.println("A"); }
	 * 
	 * void methodTwo() { System.out.println("B");
	 * 
	 * methodOne(); }
	 */

	int a = 0;

	static {
		System.out.println("inside 1 st static block");
	}

	static {
		System.out.println("inside 2nd static block");
	}

	static {
		System.out.println("inside 3rd static block");
	}
	{
		System.out.println("inside  2 instance block");
	}
	{
		System.out.println("inside  1 instance block");
	}

	/*
	 * { System.out.println("inside instance block"); m2(); }
	 * 
	 * static { System.out.println("inside static block"); m1(); }
	 * 
	 * public static void m1() { System.out.println("hello 1 st static method"); }
	 * 
	 * public void m2() { System.out.println("inside 1 st instnce method"); m1(); }
	 */

}

public class DemoStaticBlock {

	
	{
		i=20;
	}
	
	int i;
	public static void main(String[] args) {

		/*
		 * System.out.println("inside main class"); A a = new A();
		 * 
		 * System.out.println("C");
		 */

//		new A().methodTwo();

		A a = new A();
		
	}
}
