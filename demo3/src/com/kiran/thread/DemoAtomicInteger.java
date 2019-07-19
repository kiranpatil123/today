package com.kiran.thread;

import java.util.concurrent.atomic.AtomicInteger;

class Animals {
	AtomicInteger count = new AtomicInteger();

	public void getCount() {
		for (int i = 0; i < 5; i++) {
//			System.out.println(Thread.currentThread() + " Started conting >>>> " + i);
			count.incrementAndGet();

			System.out.println(count.get());
		}
	}
}

class AtomicThread extends Thread {

	Animals animals;

	public AtomicThread(Animals animals) {
		this.animals = animals;
	}

	@Override
	public void run() {
		animals.getCount();
		System.out.println("thread 0 >>>>> "+ animals.count.get());
	}
}

class AtomicThread1 extends Thread {
	Animals animals;

	public AtomicThread1(Animals animals) {
		this.animals = animals;
	}

	@Override
	public void run() {
		animals.getCount();
		System.out.println("thread 0 >>>>> "+animals.count.get());
	}
}

/*
 * class ProcessingThread implements Runnable { private AtomicInteger count =
 * new AtomicInteger();
 * 
 * @Override public void run() { for (int i = 1; i < 5; i++) {
 * processSomething(i); count.incrementAndGet(); } }
 * 
 * public int getCount() { return this.count.get(); }
 * 
 * private void processSomething(int i) { // processing some job try {
 * Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
 * }}
 */
public class DemoAtomicInteger {

	public static void main(String[] args) throws InterruptedException {

		Animals animals = new Animals();

		AtomicThread atomicThread = new AtomicThread(animals);
		AtomicThread1 atomicThread1 = new AtomicThread1(animals);

		atomicThread.start();
		atomicThread1.start();

		atomicThread.join();
		atomicThread1.join();
		
		System.out.println(animals.count.get());

		/*
		 * ProcessingThread pt = new ProcessingThread(); Thread t1 = new Thread(pt,
		 * "t1"); t1.start(); Thread t2 = new Thread(pt, "t2"); t2.start(); t1.join();
		 * t2.join(); System.out.println("Processing count=" + pt.getCount());
		 */
	}

}
