package com.facebook.multithreading;

public class Caller implements Runnable{
	private String msg;
	private Callme target;
	private Thread t;
	public Caller(Callme callme, String msg) {
		target=callme;
		this.msg=msg;
		t=new Thread(this);
		t.start();
	}

	@Override
	public synchronized void run() {
		target.call(msg);
		
	}

}
