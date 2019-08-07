package com.kiran.java8features;




/**
 * @author kiran_veeranna
 *
 */
interface Demo {

	public static int myMethod() {
		return 133;
	}
	
	
	
	/**
	 * in java 8 interface can contain two methods static and default method 
	 * default method can be overrided in the sub class  
	 * @return
	 */
	public default int myMethod2() {
		return 9090;
		
	}
	
	public default int myMeth() {
		return 90;
	}
	
	

}


class Demo1 implements Demo{
	@Override
	public int myMeth() {
		
		return 233;
	}
}


public class DemoInterface {

	public static void main(String[] args) {

		int i = Demo.myMethod();
		System.out.println(i);
		
		Demo1 demo1=new Demo1();
		int myMeth = demo1.myMeth();
		System.out.println(myMeth);
		int myMethod2 = demo1.myMethod2();
		System.out.println(myMethod2);
	}

}
