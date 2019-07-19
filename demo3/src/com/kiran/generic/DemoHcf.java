package com.kiran.generic;

public class DemoHcf {

	/*
	 * static int gcd(int a, int b) { // Everything divides 0 if (a == 0) return b;
	 * if (b == 0) return a;
	 * 
	 * // base case if (a == b) return a;
	 * 
	 * // a is greater if (a > b) return gcd(a - b, b); return gcd(a, b - a); }
	 */

	static boolean checkPrime(int x) {

		boolean isPrime = false;

		for (int i = 2; i < x; i++) {

			if (x % i == 0) {
				isPrime = true;

				break;
			}

		}
		return isPrime;
	}

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			boolean prime = checkPrime(i);
//			System.out.println(prime);
			if (!prime) {
				System.out.println(i);
			}
		}

	}
}
