package com.kiran.reflection;

import java.lang.reflect.Field;

class Kiran {

	private int eid;
	private String ename;

	public Kiran(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

}

public class DemoReflection {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Kiran kiran = new Kiran(1, "patil");
		Class<? extends Kiran> class1 = kiran.getClass();
		Field field = class1.getDeclaredField("ename");
		field.setAccessible(true);
		Object obj=field.get(kiran );
		String s1=(String)obj;
		System.out.println(s1);

	}
}
