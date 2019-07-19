package com.kiran;

public class StringDemo {

	public static void main(String[] args) {
		
		/*
		 * String eid="eid"; StringBuilder str=new StringBuilder();
		 * str.append("{allEmployees{");
		 * 
		 * str.append(eid+ "\\t"); str.append("ename"); System.out.println(str);
		 */

		
		 String s1=new String("aa");
		 System.out.println(s1.matches("\\D+"));
		 
		 
		 String s2="31aa";
		 String s3="aa11";
		 
		 
		 String replaceAll = s2.replaceAll("\\D", "");
		 String replaceAll2 = s3.replaceAll("\\D", "");
		 
		/*
		 * System.out.println(replaceAll); System.out.println(replaceAll2);
		 */
		 

		 System.out.println(Integer.parseInt(replaceAll));
		 System.out.println(Integer.parseInt(replaceAll2));
		 
	}

}
