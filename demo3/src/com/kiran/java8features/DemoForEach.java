package com.kiran.java8features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kiran");
		list.add("patil");
		list.add("love");

		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list.forEach(System.out::println);

		Collections.sort(list1,(o1,o2)->{return o1.compareTo(o2);} );
		
		
		Collections.sort(list1,Comparator.naturalOrder());
		
		
		Collections.sort(list, (s1, s2) -> {
			return s1.compareTo(s2);
		});

		/*
		 * list.forEach((s1) -> { System.out.println(s1); });
		 */

	}

}
