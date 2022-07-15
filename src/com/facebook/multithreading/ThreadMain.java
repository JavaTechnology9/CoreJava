package com.facebook.multithreading;

public class ThreadMain {

	public static void main(String[] args) {
		ExtendsThread thread1 = new ExtendsThread("one");
		ExtendsThread thread2 = new ExtendsThread("two");
		ExtendsThread thread3 = new ExtendsThread("three");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("child thread: " +thread1);
		System.out.println("child thread: " +thread2);
		System.out.println("child thread: " +thread3);
		System.out.println("thread one isAlive " +thread1.isAlive());
		System.out.println("thread two isAlive " +thread2.isAlive());
		System.out.println("thread three isAlive " +thread3.isAlive());
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			//Thread.currentThread().join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("thread one isAlive " +thread1.isAlive());
		System.out.println("thread two isAlive " +thread2.isAlive());
		System.out.println("thread three isAlive " +thread3.isAlive());

	}

}
