package com.kiran;

public class DemoArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5 };
		int[] b = new int[a.length];
		/*
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * b[i] = a[i]; System.out.println(a[i]);
		 * 
		 * } int count = 2;
		 * 
		 * for (int i = 0; i < a.length; i++) { if (count == i) {
		 * 
		 * for (int j = i + 1; i < a.length - 1; j++) {
		 * 
		 * a[i] = a[j]; i++; }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * for (int k = 0; k < a.length-1; k++) { System.out.print(a[k]); }
		 */
		
		System.out.println("before adding an element");
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}

		int c[] = new int[a.length + 1];

		for (int i = 0, j = 0; i < a.length; i++, j++) {
			if (i == 2) {
				c[j] = 3;
				j++;
			}
			c[j] = a[i];

		}
		System.out.println("after adding an element");
		for(int k=0;k<c.length;k++) {
			System.out.println(c[k]);
		}
	}
}
