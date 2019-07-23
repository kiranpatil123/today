package com.kiran.generic;

import java.util.Collections;
import java.util.LinkedList;

class KiranStack {
	private int defaultcapacity = 5;

	private int[] stackArray = new int[defaultcapacity];

	private int size;

	private int top = -1;

	KiranStack() {
		stackArray = new int[defaultcapacity];

	}

	KiranStack(int capacity) {
		stackArray = new int[capacity];
	}

	public void push(int a) {
		top = top + 1;
		stackArray[top] = a;

		size = size + 1;

	}

	public void getAllElementFromStack() {
		for (int i = 0; i < stackArray.length; i++) {
			System.out.println("eleemnt inside stack " + stackArray[i]);
		}
	}

	public int pop() {
		System.out.println(top);
		int i = stackArray[top];
		System.out.println("element from stack " + i);
		top = top - 1;
		System.out.println(top);

		return i;
	}

}

public class DemoStck {

	public static void main(String[] args) {

		KiranStack kiranStack = new KiranStack(5);
		kiranStack.push(1);

		kiranStack.push(2);
		kiranStack.push(3);
		kiranStack.push(4);
		kiranStack.push(5);

		kiranStack.getAllElementFromStack();

		kiranStack.pop();

		kiranStack.push(6);

		kiranStack.getAllElementFromStack();

		LinkedList<String> list = new LinkedList<>();
		list.add("hi");
		list.add("hello");

		
	}

}
