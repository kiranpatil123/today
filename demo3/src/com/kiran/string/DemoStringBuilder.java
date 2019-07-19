package com.kiran.string;

public class DemoStringBuilder {
	public static void main(String[] args) {
		/*
		 * StringBuffer stringBuffer = new StringBuffer("kiran"); StringBuffer
		 * stringBuffer2 = new StringBuffer("kiran"); System.out.println(stringBuffer ==
		 * stringBuffer2); System.out.println(stringBuffer.equals(stringBuffer2));
		 */


		/*
		 * char cs[]= {'c','h','a','r'}; String s1=new String(cs);
		 * System.out.println(s1);
		 */
		StringBuilder stringBuilder=new StringBuilder();
		
		
		stringBuilder.append("hi hello how are ");
		System.out.println(stringBuilder.length());
		System.out.println(stringBuilder.capacity());
		
		stringBuilder.trimToSize();
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.length());
		System.out.println(stringBuilder.capacity());
		
		
	}
}
