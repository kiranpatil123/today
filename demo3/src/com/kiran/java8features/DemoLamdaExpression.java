package com.kiran.java8features;

interface Lamda {
	int x=909;
	public int myMethod(int a, int b);
//	public void myMethod2();
}

interface Lamda1{
	int x=909;
	public void myMethod2();
}

public class DemoLamdaExpression {

	public static void main(String[] args) {

		Lamda lamda = (int a, int b) -> (a+b);
		

		int i = lamda.myMethod(7, 8);
		System.out.println(i);
		
		
		Lamda1 lamda1=()->{
			System.out.println(Lamda1.x);
			System.out.println("hi");};
		lamda1.myMethod2();
	}

}
