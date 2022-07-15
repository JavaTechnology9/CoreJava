package com.core07.multithreading;

public class Consumer implements Runnable {
	PQ target;
	public Consumer(PQ target) {
		this.target=target;
		new Thread(this, "Consumer").start();
	}
	@Override
	public void run() {
		while(true)
			target.get();
		
	}
}
