package com.kiran.thread;

public class DemoStringBuilder2 {

	public static void main(String[] args) {
		int N = 10000000;
		long t;

		{
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}

		{
			StringBuilder sb = new StringBuilder();
			t = System.currentTimeMillis();
			for (int i = N; i > 0; i--) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}

	}

}
