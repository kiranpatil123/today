package com.kiran.string;

class Demo2 {
	public boolean checkPalindrome(String s1) {

		if (s1.length() == 0 || s1.length() == 1) {
			return true;
		}
		if (s1.charAt(0) == s1.charAt(s1.length() - 1)) {
			return checkPalindrome(s1.substring(1, s1.length() - 1));
		}
		return false;
	}
}

public class DemoPalindrome {
	public static void main(String[] args) {

		Demo2 demo2 = new Demo2();
		if (demo2.checkPalindrome("liril")) {
			System.out.println("given string is a palindrome");
		} else {
			System.out.println("given string is not palindrome");
		}

		/*
		 * String s1 = "liril"; System.out.println(s1.substring(1));
		 * System.out.println(s1.substring(1, s1.length() - 1));
		 * 
		 * int j = s1.length() - 1; for (int i = 0; i < s1.length() && j >= 0; i++) { if
		 * (s1.charAt(i) != s1.charAt(j)) {
		 * System.out.println("given string is not palindrome"); } j--; }
		 * 
		 * }
		 */

		/*
		 * public static boolean checkPalindrome(String s1) { return false; }
		 */
	}
}