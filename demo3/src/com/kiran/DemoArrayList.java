package com.kiran;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4,5,6,7,8,9 };

		System.out.println("Array Length before copying "+a.length);
		a = Arrays.copyOf(a, a.length + a.length);
		for (int b : a) {
			System.out.println(b);
		}
		
		System.out.println("Array Length after copying "+a.length);
	}
	

}
