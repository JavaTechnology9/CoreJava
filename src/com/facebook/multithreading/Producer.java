package com.facebook.multithreading;

public class Producer implements Runnable{
	private Stack stck;
	public Producer(Stack stck) {
		this.stck=stck;
		new Thread(this, "Producer").start();
	}

	@Override
	public synchronized void run() {
		int i=0;
		while(true) {
			stck.put(i++);
		}
		
	}

}
