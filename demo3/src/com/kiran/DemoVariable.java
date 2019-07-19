package com.kiran;

class VariableAccess {
	public VariableAccess() {

	}

	public int x;
	public double xx;
	public static boolean y;
	public char c;
	public static int z = 5;
	public String s1;

	public void getAllVariable() {

		System.out.println(x);
		System.out.println(xx);
		System.out.println(y);
		System.out.println(z);
		System.out.println(c);
		System.out.println(s1);
	}

}

public class DemoVariable {
	public static void main(String[] args) {
//		VariableAccess variableAccess;
//		System.out.println(variableAccess);
		VariableAccess variableAccess = new VariableAccess();
		variableAccess.getAllVariable();
		VariableAccess.z = 9;
		
		VariableAccess variableAccess1 = new VariableAccess();
		variableAccess1.getAllVariable();
		
		
	}
}
