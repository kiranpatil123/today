package com.kiran;

/**
 * @author kiran_veeranna Method overloading(Object takes many form ) is a
 *         concept which decides at compile time, same functionality can be
 *         achieved using different arguments compiler checks the method
 *         name,number of arguments and then it checks type of the arguments if
 *         all are same then it shows duplicate method error
 * 
 *         return type, access specifiers, and also final & static are not takes
 *         into account It is also called as late biding & early binding
 */
class MethodOverload {

	public MethodOverload() {
	}

	public void addMethod(int a, int b) {
		System.out.println(a + b);
	}
	/*
	 * public void addMethod(int a, int b) { System.out.println(a + b); }
	 */

	
	/**
	 * @param a
	 * @param b
	 * @return
	 * @throws IllegalArgumentException
	 */
	public double addMethod(int a, double b) throws IllegalArgumentException {
		return a + b;
	}

	
	/**
	 * @param a
	 * @param b
	 * @return addition 
	 */
	public float addMethod(int a, float b) {
		return a + b;
	}
}

public class DemoMethodOverloading {
	public static void main(String[] args) {
		MethodOverload methodOverload = new MethodOverload();
		methodOverload.addMethod(7, 10.05);
	}
}
