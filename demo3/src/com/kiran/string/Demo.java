package com.kiran.string;

import java.io.Serializable;

class Serial implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9102092723609579453L;

}

public class Demo {
	public static void main(String[] args) {
		String s1 = "kiran";
		String s2 = "kiran";
		s1.concat("jo");
		
		

		String s3 = new String("kiran");

		if (s1 == s2) {
			System.out.println("both s1 and s2 are equal");
		}

		if (s1.equals(s2)) {
			System.out.println("both s1 and s2 are equal");
		}

		if (s1 == s3) {
			System.out.println("both s1 and s3 are equal");
		} else {
			System.out.println("both s1 and s3 are not equal");
		}

		if (s1 == s3.intern()) {
			System.out.println("both s1 and s3 are equal");
		}
	}

}
