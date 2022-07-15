package com.core07.multithreading;

public class DeadlockA {
	synchronized void foo(DeadlockB b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered into DeadlockA.foo method.");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			System.out.println("DeadlockA is interrupted.");
		}
		System.out.println(name +" trying to call DeadlockB.last method");
		b.last();
	}
	synchronized void last() {
		System.out.println("DeadlockA last method");
	}

}
