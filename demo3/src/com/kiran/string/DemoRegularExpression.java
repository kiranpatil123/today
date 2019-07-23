package com.kiran.string;

public class DemoRegularExpression {
	public static void main(String[] args) {

		String s1="kiran20";
		String s2="90patil";
		
		String replaceAll = s1.replaceAll("\\D", "");
		System.out.println(replaceAll);
		
		String replaceAll1 = s2.replaceAll("\\D", "");
		System.out.println(replaceAll1);
		
		String s3="addsss%^&**asd";
		String replaceAll2 = s3.replaceAll("\\W", "");
		System.out.println(replaceAll2);
		
		
		String[] split = s1.split("\\D");
		
		for(int i=0;i<split.length;i++) {
			System.out.println("iteration "+split[i]);
		}
		
		
		
	}
}
