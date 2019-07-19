package com.kiran;

abstract class AbstrctDemo {
	private  int a;

	public  AbstrctDemo(int a) {
		this.a = a;
	}

	public abstract void myMethod();

	public String myMethod2() {
		return "hello";
	}

//	public abstract int myMethod3();
}

class Asubclass extends AbstrctDemo {

	public Asubclass(int a) {
		super(a);

	}

	public Asubclass() {
		this(10);
	}

	@Override
	public void myMethod() {
		System.out.println("hi");

	}

}

public class DemoAbstract {
	public static void main(String[] args) {

		Asubclass a = new Asubclass();
		if (a instanceof AbstrctDemo) {
			a.myMethod();
		}

		AbstrctDemo ad = new Asubclass();
		ad.myMethod();

		System.out.println(ad.myMethod2());

	}

}
