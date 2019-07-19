package com.kiran.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TestCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 30;
	}

}

public class DemoCallable {
	public static void main(String[] args) {
//        Executors.newFixedThreadPool(10);
//		Thread t1 = new Thread(new TestCallable(), "FirstCallableExample");
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Integer> future = executorService.submit(new TestCallable());
		try {
			Integer integer = future.get();
			System.out.println(integer);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
