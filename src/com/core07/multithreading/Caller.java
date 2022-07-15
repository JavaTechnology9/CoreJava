package com.core07.multithreading;

public class Caller extends Thread implements Runnable {
	String msg;
	Callme target;
	//Thread t;
	public Caller(Callme target, String name) {
		super(name);
		this.target=target;
		this.msg=name;
		//t=new Thread(this, name);
		start();
	}
	@Override
	public void run() {
		synchronized(target) {
			target.call(msg);
		}
		
	}
	public static void main(String[] args) {
		Callme me=new Callme();
		Caller call1=new Caller(me, "Hello");
		Caller call2=new Caller(me, "Synchronized");
		Caller call3=new Caller(me, "World");
		try {
			call1.join();
			call2.join();
			call3.join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}

}
