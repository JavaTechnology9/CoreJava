package com.facebook.multithreading;

public class Stack {
	private int n;
	boolean valueSet=false;
	synchronized int get() {
		while(!valueSet)
			try {
				wait();
			}catch(InterruptedException ex) {
				System.out.println("InterruptedException caught");
			}
		System.out.println("Get :" +n);
		valueSet=false;
		notify();
		return n;
	}
	synchronized void put(int n) {
		while(valueSet)
			try {
				wait();
			}catch(InterruptedException ex) {
				System.out.println("InterruptedException caught");
			}
		this.n=n;
		valueSet=true;
		System.out.println("Put : "+n);
		notify();
	}

}
