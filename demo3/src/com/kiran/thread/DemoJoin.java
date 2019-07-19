package com.kiran.thread;

class EmployeeThread implements Runnable {

	private Employee emp;

	public EmployeeThread(Employee employee) {
		emp = employee;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		emp.myMrthod();
		try {

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(emp.getEname() + " " + emp.getEmail() + " " + emp.getEid());

	}

}

class NormalThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread started counting " + Thread.currentThread() + " " + i);
		}
	}

}

class EmployeeThread1 implements Runnable {
	private Employee emp;

	public EmployeeThread1(Employee employee) {
		emp = employee;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println(emp.getEname() + " " + emp.getEmail() + " " + emp.getEid());

	}

}

public class DemoJoin {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * Thread t1 = new Thread(new EmployeeThread(new Employee(1, "kiran",
		 * "kiran@gmail.com"))); // Thread t2=new Thread(new EmployeeThread1(new
		 * Employee(1, "kiran", "kiran@gmail.com"))); t1.start();
		 */
		NormalThread normalThread = new NormalThread();
		normalThread.setName("kiran");
		/*
		 * Thread t1 = new Thread(new EmployeeThread(new Employee(1, "kiran",
		 * "kiran@gmail.com"))); normalThread.start(); t1.start();
		 * 
		 * // Thread t2=new Thread(new EmployeeThread1(new Employee(1, "kiran",
		 * "kiran@gmail.com")));
		 * 
		 * // normalThread.join(); t1.join();
		 * 
		 * try { t2.start(); t2.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		NormalThread normalThread2 = new NormalThread();
		normalThread2.setName("patil");
		normalThread.start();
		normalThread2.start();

		normalThread2.join();

		System.out.println("Finishes all the operation");

	}
}
