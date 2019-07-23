package com.kiran.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class DemoTree {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		boolean add = tree.add("kiran");
		System.out.println(add);
		boolean add1= tree.add("kiran");
		System.out.println(add1);
		
		
		tree.add("patil");
		tree.add("srini");

	System.out.println(tree);
	
	NavigableSet<String> descendingSet = tree.descendingSet();
	
	}

}
