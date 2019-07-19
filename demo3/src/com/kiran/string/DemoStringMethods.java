package com.kiran.string;

public class DemoStringMethods {

	public static void main(String[] args) {
		String s1 = " hi how are you ";
		/*
		 * System.out.println(s1.contains("how"));
		 * System.out.println(s1.endsWith("you"));
		 * System.out.println(s1.indexOf("how")); System.out.println(s1.indexOf(3));
		 * System.out.println(s1.compareTo("hi how are you"));
		 */
		/*
		 * System.out.println(s1.length()); System.out.println(s1.trim().length());
		 * String string = s1.replaceAll("\\s", "");
		 * System.out.println(string.length());
		 */
//		IntStream chars = s1.chars();
//		System.out.println(s1.charAt(1));
		String[] split = s1.trim().split("\\s");
		for (int i=split.length-1;i>=0;i--) {
			/*
			 * System.out.println(i); System.out.println(split[i]);
			 */
			String s=split[i];
			for(int j=s.length()-1;j>=0;j--) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
		
		
	}
}
