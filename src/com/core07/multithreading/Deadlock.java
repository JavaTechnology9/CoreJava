package com.core07.multithreading;

public class Deadlock implements Runnable {
	DeadlockA a=new DeadlockA();
	DeadlockB b=new DeadlockB();
	public Deadlock() {
		Thread.currentThread().setName("MainThread");
		Thread t=new Thread(this, "RacingThread");
		t.start();
		a.foo(b);
		System.out.println("going back to main method");
	}
	@Override
	public void run() {
		b.bar(a);
		System.out.println("calling from run method");
	}
	public static void main(String[] args) {
		new Deadlock();
	}

}
