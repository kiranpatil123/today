package com.kiran.generic;

class KiranQueue {

	private Object[] object = new Object[5];

	private int capacity;
	private int front;
	private int rear;

	public void insertData(Object o1) {

		object[rear] = o1;
		rear = (rear + 1)%5;

	}

	public Object takeDataOut() {
		Object object2 = object[front];
		front = (front + 1)%5;
		return object2;
	}

	public void showAllDatainQueue() {
		for (int i = 0; i < object.length ; i++) {
			System.out.println(object[(front + i)%5]);
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

		kiranQueue.showAllDatainQueue();

		System.out.println("After the data is take out from queue");
		kiranQueue.takeDataOut();

		kiranQueue.showAllDatainQueue();
		kiranQueue.takeDataOut();

		System.out.println("After the data is take out from queue");
		kiranQueue.takeDataOut();

		kiranQueue.showAllDatainQueue();
		kiranQueue.takeDataOut();

		/*
		 * kiranQueue.takeDataOut(); kiranQueue.showAllDatainQueue();
		 */
	}

}
