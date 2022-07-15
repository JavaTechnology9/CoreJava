package com.core07.multithreading;

public class PQ {
	int n;
	boolean valueSet=false;
	synchronized int get() {
		while(!valueSet)
			try {
				System.out.println("wait method called ...in get method");
				wait();
			}catch(InterruptedException ex) {
				System.out.println("wait method is Interrupted in get method.");
			}
		System.out.println("Got: " +n);
		valueSet=false;
		notify();
		return n;
	}
	synchronized void push(int n) {
		while(valueSet)
			try {
				System.out.println("wait method called ...in push method");
				wait();
			}catch(InterruptedException ex) {
				System.out.println("wait method is Interrupted in put method.");
			}
		this.n=n;
		valueSet=true;
		System.out.println("Put: "+ n);
		notify();
	}

}
