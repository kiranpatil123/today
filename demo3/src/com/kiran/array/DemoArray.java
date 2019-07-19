package com.kiran.array;

class KiranQueue {

	private Object queue[] = new Object[5];

	private int front;

	private int rear;

	public void add(int a) {

		queue[rear] = a;
		rear++;

	}

	/*
	 * public int get() { for(int i=0;i<5;i++) { queue[i]; } }
	 */

}

public class DemoArray {
	public static void main(String[] args) {

		/*
		 * KiranQueue queue = new KiranQueue(); queue.add(1); queue.add(2);
		 * queue.add(3); System.out.println(queue.get());
		 */
		
		
	}

}
