package com.kiran;

abstract class Deemo {
	public abstract String hiMethod();
}

interface Vehicle {
	int a = 30;

	public static String myMethod() {
		return "kiran";
	}

	public default String myMethod2() {
		return "patil";
	}

	public String myMethod3();
}

interface Bike {
	public void bikeMethod();
}

interface car extends Vehicle,Bike {
	public void helloMethod();
}

class VehicleImpl extends Deemo implements car {

	/*
	 * public String myMethod() {
	 * 
	 * return "kiran"; }
	 */

	@Override
	public String myMethod3() {
		// TODO Auto-generated method stub
		return "patil";
	}

	@Override
	public String hiMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void helloMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bikeMethod() {
		// TODO Auto-generated method stub
		
	}

}

public class DemoInterface {
	public static void main(String[] args) {

//		Vehicle.a=90;
		System.out.println(Vehicle.a);

		
//		Vehicle.myMethod()
//		System.out.println(Vehicle.);
		VehicleImpl vehicleImpl = new VehicleImpl();
		System.out.println(vehicleImpl.myMethod2());
		System.out.println(Vehicle.myMethod());
	}
}
