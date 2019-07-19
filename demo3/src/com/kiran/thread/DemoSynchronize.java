package com.kiran.thread;

class Counter {
	int c;

	/*
	 * public Counter() {
	 * 
	 * }
	 */

	/* synchronized */public void incrementCount() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
//			Thread.sleep(300);
			c++;
			System.out.println("Count "+Thread.currentThread() + c);
//			Thread.sleep(200);
		}

	}
}

class MyThread2 extends Thread {

	private Counter counter;

	public MyThread2(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {

		synchronized (counter) {
			try {
				counter.incrementCount();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
//		System.out.println("Count " + counter.c);

	}
}

class MyThread3 extends Thread {

	private Counter counter;

	public MyThread3(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {

		synchronized (counter) {
			try {
				counter.incrementCount();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
//		System.out.println("Count " + counter.c);

	}
}

public class DemoSynchronize {
	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();
//		

		MyThread2 myThread2 = new MyThread2(counter);
//		myThread2.setName("FirstThread");
		MyThread3 myThread3 = new MyThread3(counter);
//		myThread3.setName("SecondThread");
		myThread2.start();
//		myThread2.join();
		myThread3.start();

	}
}
