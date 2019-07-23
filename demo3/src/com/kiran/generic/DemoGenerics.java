package com.kiran.generic;

import java.util.ArrayList;

class Demo<T,E> {
	
	int a, b;

	
	public void mySecond(T t) {
		System.out.println(t);
	}
}

class Demo1 extends Demo {

}



class Tire {
	public void myMethods(ArrayList<? extends Number> list) {
//	return list.get(0);
	}

	public void myMethod1(ArrayList<? extends Demo> list) {

	}

	@SuppressWarnings("unchecked")
	public <T> T myMethod3(int i, Class<T> t) {
		System.out.println("It entres to fetch the value");
		
//		if( instanceof String)
		return (T) "hi";
	}
}

public class DemoGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo<String,String> demo=new Demo();
		demo.mySecond("kiran");
		
		/*
		 * Tire tire = new Tire(); tire.myMethods(new ArrayList<Number>());
		 * 
		 * tire.myMethod1(new ArrayList<Demo1>());
		 * 
		 * String string = tire.myMethod3(3, String.class); System.out.println(string);
		 */
	}

}
