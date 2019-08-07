package com.kiran.innerclass;

import com.kiran.innerclass.Demo.Demo1;

class Demo {
	int i = 90;
	
	public void myMethod2() {
		Demo1 demo1=new Demo1();
		demo1.myMethod();
	}
	

	class Demo1 {

		public static final int x=90;
		{
			System.out.println("hi welcome");
		}

		public int myMethod() {
			return i;
		}
	}
}

public class DemoInner {

	public static void main(String[] args) {

		
		Demo demo=new Demo();
		demo.myMethod2();
		System.out.println(demo.i);
		Demo1 demo1 = demo.new Demo1();
		demo1.myMethod();
		
	}

}
