package com.core07.multithreading;

public class DeadlockB {
	synchronized void bar(DeadlockA b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered into DeadlockB.bar method.");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			System.out.println("DeadlockB is interrupted.");
		}
		System.out.println(name +" trying to call DeadlockA.last method");
		b.last();
	}
	synchronized void last() {
		System.out.println("DeadlockB last method");
	}

}
