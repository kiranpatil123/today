package com.kiran;

import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String[] args) {
		/*
		 * ArrayList<String> arrayList = new ArrayList<>(); arrayList.add("kiran");
		 * System.out.println(arrayList.get(0));
		 * 
		 * System.out.println(Math.max(6, 7) );
		 */
		
		String s1="kiran";
		char[] charArray = s1.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.println(charArray[i]);
		}
	}

}
