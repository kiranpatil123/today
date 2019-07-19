package com.kiran.singleton;

class Cars {

	private static Cars cars = null;

	private Cars() {

	}

	public  static Cars getInstance() {
		if (cars == null) {
			cars = new Cars();
		}
		return cars;
	}

}

public class DemoSingleton {

	public static void main(String[] args) {
		Cars cars = Cars.getInstance();
		Cars cars2 = Cars.getInstance();
		if(cars == cars2) {
			System.out.println("Both objcets are refered to same object");
		}
	
		 
	}

}
