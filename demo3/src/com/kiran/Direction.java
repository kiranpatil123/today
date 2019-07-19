package com.kiran;

public enum Direction {
	EAST("e");

	private final String s;

	Direction(String s1) {
		this.s = s1;
	}
	
	
	public String getName() {
		return this.s;
	}
}
