package com.kiran.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
//import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class MyThread implements Runnable {

	@Override
	public void run() {
//		System.out.println("My First Thread got executed");
//		
		for (int i = 0; i < 100; i++) {

			/*
			 * try { // Thread.sleep(2000);
			 * 
			 * } catch (InterruptedException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */

			System.out.println("thraed stared" + " " + Thread.currentThread() + " " + i);

		}
	}

}

public class DemoThread {

	public static void main(String[] args) {
		
		ThreadPoolExecutor threadPoolExecutor =(ThreadPoolExecutor)Executors.newFixedThreadPool(2);
		System.out.println(threadPoolExecutor.isTerminated());
		
		threadPoolExecutor.execute(new MyThread());
		threadPoolExecutor.execute(new MyThread());
		threadPoolExecutor.execute(new MyThread());
		threadPoolExecutor.execute(new MyThread());
		threadPoolExecutor.execute(new MyThread());
		System.out.println("Queue size"+" "+threadPoolExecutor.getQueue().size());
		System.out.println("task"+" "+threadPoolExecutor.getCompletedTaskCount());
		threadPoolExecutor.shutdown();
		System.out.println(threadPoolExecutor.getActiveCount());
//		System.out.println("task"+" "+threadPoolExecutor.getCompletedTaskCount());
		System.out.println(threadPoolExecutor.getPoolSize());
		System.out.println("Queue size"+" "+threadPoolExecutor.getQueue().size());
		System.out.println(threadPoolExecutor.isTerminated());
	
		/*
		 * Thread t1 = new Thread(new MyThread(),"FirstThread"); Thread t2 = new
		 * Thread(new MyThread(),"SecondThread"); t1.start(); t1.start(); t2.start();
		 */
	}

}
