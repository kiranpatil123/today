package com.kiran;

class Animal {
	public String a = "demoString";

	public void colorOfAnimal() {
		System.out.println("Animal characterstics");
	}
}

class Cat extends Animal {
	public void colorOfAnimal1() {

	}

	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}
}

public class DemoSubClass {
	public static void main(String[] args) {
		/*
		 * Animal a = new Cat(); Cat c = new Cat();
		 * 
		 * if (c instanceof Animal) { System.out.println("yes its instance of animal");
		 * 
		 * }
		 * 
		 * Cat k = (Cat) a; k.colorOfAnimal();
		 */
		
		/*
		 * Cat c =new Cat(); c.sum(20, 20);
		 */

	}
}
