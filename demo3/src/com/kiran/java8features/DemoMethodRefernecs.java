package com.kiran.java8features;

import java.util.function.Function;

interface Demo3 {
	public void dispaly();
}

class Demo4 {
	public void display1() {
		System.out.println("hi");
	}
}

public class DemoMethodRefernecs {

	public static void main(String[] args) {
		Demo4 demo4 = new Demo4();
		Demo3 demo3 = demo4::display1;
		demo3.dispaly();

	}

}
