package com.kiran.enums;

enum Direction {
	NORTH("north direction"), SOUTH("south direction"), EAST("east direction"), WEST("west direction");

	private String direction;

	private Direction(String direction) {
		this.direction = direction;
	}

	public String getString() {
		return direction;
	}

	public void myMethod() {
		System.out.println("Common Method");
	}
}

public class DemoEnum {

	public static void main(String[] args) {
		System.out.println(Direction.EAST);
		System.out.println(Direction.NORTH.getString());
		

	}

}
