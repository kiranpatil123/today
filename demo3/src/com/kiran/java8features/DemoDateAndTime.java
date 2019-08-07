package com.kiran.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DemoDateAndTime {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalTime now2 = LocalTime.now();
		System.out.println(now2);
		
		LocalDateTime now3 = LocalDateTime.now();
		System.out.println(now3);
		
		
		LocalDate plusDays = now.plusDays(3);
		
		System.out.println(plusDays);
		
	}

}
