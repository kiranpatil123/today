package com.kiran.string;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Serial implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9102092723609579453L;

}

public class Demo {
	public static void main(String[] args) {

		String s1 = " hi hello how are you ";
		System.out.println(s1);
		System.out.println(s1.trim());

		String replaceAll = s1.replaceAll(" ", "");
		System.out.println(replaceAll);

		String s2 = "kiranki";

		char[] cs = s2.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : cs) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, new Integer(1));
			}

		}

		map.forEach((key, value) -> {
			System.out.println(key + ":" + value);
		});

		System.out.println("duplicates keys");

		for (Character ch : map.keySet()) {
			if (map.get(ch) > 1) {
				System.out.println(ch);
			}
		}

		Set<Character> set = new HashSet<>();

		System.out.println("duplicates keys");
		for (char c : cs) {
			if (!set.add(c)) {
				System.out.println(c);
			}
		}

		String s3 = "I am not a string";
		String[] split = s3.split(" ");
		StringBuilder builder = new StringBuilder();
		for (int i = split.length - 1; i >= 0; i--) {
			builder.append(split[i] + " ");
		}
		System.out.println(builder);

		StringBuilder builder1 = new StringBuilder();
		for (int i = 0; i < split.length; i++) {

			if (split[i].length() == 1) {
				builder1.append(split[i] + " ");
			} else {
				String s5 = "";
				char[] charArray = split[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					s5 = s5 + charArray[j];
				}
				builder1.append(s5 + " ");
			}
		}
		System.out.println(builder1);

		char[] c = { 'p', 'e', 'e', 'k' };
		char[] c1 = { 'k', 'e', 'e', 'p' };
		Arrays.sort(c);
		Arrays.sort(c1);
		for (char d : c) {
			System.out.println(d);
		}

		for (char d : c1) {
			System.out.println(d);
		}

		System.out.println(Arrays.equals(c, c1));

		String lx = "Rule1->Rule2->action->end";

		String[] split2 = lx.split("->");
		for (String s8 : split2) {
			if (s8.startsWith("Rule".toLowerCase()) || s8.startsWith("rule".toUpperCase())) {
				System.out.println(s8);
			}
		}

		/*
		 * if() {
		 * 
		 * }
		 */

		/*
		 * String s1 = "kiran"; String s2 = "kiran"; s1.concat("jo");
		 * 
		 * 
		 * 
		 * String s3 = new String("kiran");
		 * 
		 * if (s1 == s2) { System.out.println("both s1 and s2 are equal"); }
		 * 
		 * if (s1.equals(s2)) { System.out.println("both s1 and s2 are equal"); }
		 * 
		 * if (s1 == s3) { System.out.println("both s1 and s3 are equal"); } else {
		 * System.out.println("both s1 and s3 are not equal"); }
		 * 
		 * if (s1 == s3.intern()) { System.out.println("both s1 and s3 are equal"); }
		 */
	}

}
