package com.kiran;

import java.lang.reflect.Field;

class SuperClass1 {
	int y = 90;
}

class SuperClass extends SuperClass1 {
	public int a = 30;

	int myMethod(int a, int b) {
		return a + b;
	}

}

class SubClass extends SuperClass {
	protected int a = 80;

	int x = 90;

	protected int myMethod(int a, int b) {
		return a - b;
	};

	public String myMethod2() {
		return "hello";
	}
}

public class DemoMethodOverriding {
	public static void main(String[] args)
	/*
	 * throws NoSuchFieldException, SecurityException, IllegalArgumentException,
	 * IllegalAccessException
	 */ {
		/*
		 * MethodOverriding methodOverriding = new MethodOverriding(); Field field =
		 * methodOverriding.getClass().getDeclaredField("a");
		 * 
		 * field.setAccessible(true); Object object = field.get(methodOverriding);
		 * Integer i = (Integer) object; System.out.println(i);
		 */

		/*
		 * Integer i=(Integer)field.get(methodOverriding); System.out.println(i);
		 */

		/*
		 * SubClass subClass = new SubClass(); System.out.println(subClass.myMethod(2,
		 * 1));
		 * 
		 * 
		 * SuperClass superClass = new SubClass();
		 * 
		 * 
		 * SubClass subClass2=(SubClass)superClass;
		 * System.out.println(subClass2.myMethod(10, 20));
		 * 
		 * 
		 * SuperClass superclass2 = (SuperClass) subClass;
		 * System.out.println(superclass2.myMethod(10, 20));
		 * System.out.println(superclass2.a);
		 */

		/*
		 * SubClass subClass = new SubClass(); SuperClass superClass = (SuperClass)
		 * subClass; System.out.println(superClass.a); // System.out.println(superClas);
		 * 
		 * SuperClass superClass = new SuperClass(); SuperClass1 subclass =
		 * (SuperClass1) superClass; System.out.println(subclass.y);
		 */
		/*
		 * SuperClass superClass = new SubClass(); System.out.println(superClass.a);
		 * 
		 * SubClass subClass = new SubClass(); System.out.println(subClass.a);
		 */

		/*
		 * SuperClass superClass = new SuperClass(); SubClass subClass = (SubClass)
		 * superClass; System.out.println(subClass.x);

		 *
		 */
		
		SuperClass superClass=new SuperClass();
		SubClass subClass=new SubClass();
		
		if( subClass instanceof SuperClass) {
			System.out.println("its correct");
		}

		Object o1 = new Integer(1);

		String s1 = (String) o1;
		System.out.println(s1);

		/*
		 * SubClass subClass=new SubClass(); System.out.println(subClass.x);
		 */
	}
}
