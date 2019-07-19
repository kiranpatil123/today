package com.kiran.thread;

/**
 * @author kiran_veeranna
 * @version
 * 
 *
 */
class Bank {

	int amount = 1000;

	/**
	 * @param amount
	 * @throws InterruptedException
	 */
	public synchronized void withDraw(int amount) throws InterruptedException {
		System.out.println("request for with drawn");
		if (this.amount < amount) {
			System.out.println("Less balance, waiting for deposit...");
			wait();
		}
		System.out.println("Total balance in account >>>> " + this.amount);
//        this.withDraw(this.amount);
		this.amount = this.amount - amount;
		System.out.println("amount is with drawn");

	}

	/**
	 * @param amount
	 */
	public synchronized void deposit(int amount) {
		System.out.println("request for deposit");
		this.amount = this.amount + amount;
		System.out.println("Amount is deposited");
		notify();

	}
}


class BankThread extends Thread {

	private Bank bank;

	public BankThread(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {

		try {
			bank.withDraw(1200);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}

class BankThread1 extends Thread {

	private Bank bank;

	public BankThread1(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		bank.deposit(100);
	}
}

public class DemoInterThreadCommunication {
	public static void main(String[] args) {

		Bank bank = new Bank();
		BankThread bankThread = new BankThread(bank);
		BankThread1 bankThread1 = new BankThread1(bank);

		bankThread.start();
		bankThread1.start();

	}
}
