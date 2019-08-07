package com.kiran.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.lang.Number;

public class DemoTree {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		boolean add = tree.add("kiran");
		System.out.println(add);
		boolean add1 = tree.add("kiran");
		System.out.println(add1);

		tree.add("patil");
		tree.add("srini");

		System.out.println(tree);

		NavigableSet<String> descendingSet = tree.descendingSet();

		HashSet<String> hashSet = new HashSet();
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add("kiran");
		hashSet.add("patil");
		hashSet.add("kiran");
		
		
		

		System.out.println(hashSet);

		/*
		 * LinkedHashSet<? extends Object> linkedSet = new LinkedHashSet<>();
		 * linkedSet.add(new Integer(1)); linkedSet.add(new Double(2.0));
		 * System.out.println(linkedSet);
		 */

	}

}
