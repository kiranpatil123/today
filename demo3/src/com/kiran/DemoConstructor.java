package com.kiran;

class B {
	
	static {
		  System.out.println("inside static block");  
	}
	{
		System.out.println("inside instance block");
	}

	B() {
		this(10);
		System.out.println("inside constructor");
	}
	
	B(int i){
		System.out.println("inside argument constructor");
	}
}

public class DemoConstructor {
	public static void main(String[] args) {
     B b=new B();
     B b1=new B(10);
	}
}
