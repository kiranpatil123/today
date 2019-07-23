package com.kiran.generic;

class KiranQueue {

	private Object[] object = new Object[5];

	private int capacity;
	private int front;
	private int rear;
	private int size;

	public void insertData(Object o1) {

		/* if (size != 5) { */

			object[rear] = o1;
			rear = (rear + 1) % 5;
			size = size + 1;
		/*
		 * } else { System.out.println("Queue is full"); }
		 */
	}

	public Object takeDataOut() {
		Object object2 = object[front];
		front = (front + 1) % 5;
		size = size - 1;
		return object2;
	}

	public void showAllDatainQueue() {
		for (int i = 0; i <= object.length - 1; i++) {
			System.out.println(object[(front + i) % 5]);
		}
	}

}

public class DemoQueue {

	public static void main(String[] args) {

		KiranQueue kiranQueue = new KiranQueue();
		kiranQueue.insertData(new Integer(1));
		kiranQueue.insertData(new Integer(2));
		kiranQueue.insertData(new Integer(3));
		kiranQueue.insertData(new Integer(4));
		kiranQueue.insertData(new Integer(5));

		System.out.println("Before take out the data");

//		kiranQueue.takeDataOut();
		kiranQueue.showAllDatainQueue();

		kiranQueue.insertData(new Integer(56));

		System.out.println("Before take out the data");

		kiranQueue.showAllDatainQueue();

		System.out.println("After the data is take out from queue");
		kiranQueue.takeDataOut();

		kiranQueue.takeDataOut();
		kiranQueue.takeDataOut();
		kiranQueue.showAllDatainQueue();
//		kiranQueue.takeDataOut();
//
//		System.out.println("After the data is take out from queue");
//		kiranQueue.takeDataOut();
//
//		kiranQueue.showAllDatainQueue();
//		kiranQueue.takeDataOut();
//		kiranQueue.takeDataOut();

		/*
		 * kiranQueue.takeDataOut(); kiranQueue.showAllDatainQueue();
		 */
	}

}
