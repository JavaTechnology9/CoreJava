package com.core07.multithreading;

public class Producer implements Runnable{
	PQ target;
	public Producer(PQ target) {
		this.target=target;
		new Thread(this, "Producer").start();
	}
	@Override
	public void run() {
		int i=0;
		while(true)
			target.push(i++);
		
	}

}
