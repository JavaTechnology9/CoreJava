package com.core07.multithreading;

public class ExtendThread extends Thread{
	public ExtendThread() {
		super("Demo Thread");
		System.out.println("Child Thread :" + this);
		start();
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("child thread i value: "+ i);
				Thread.sleep(5);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
