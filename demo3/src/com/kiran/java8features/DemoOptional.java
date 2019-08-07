package com.kiran.java8features;

import java.util.Optional;

public class DemoOptional {

	public static void main(String[] args) {

		Optional<String> optional = Optional.of("kiran");
		Optional<Object> optional2 = Optional.empty();
		String string = optional.get();
		System.out.println(string);
		if (optional.isPresent()) {
			System.out.println("yes it is present");
		}
		if (optional2.isPresent()) {
			System.out.println("yes it is present");
		} else {
			System.out.println("it is not present");
		}

	}

}
