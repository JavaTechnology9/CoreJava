package com.facebook.multithreading;

public class ExtendsThread extends Thread{
	private String name;
	public ExtendsThread(String name) {
		super(name);
		this.name=name;				
	}
	
	@Override
	public void run() {
		try {
			for(int i =0; i<1;i++) {
				System.out.println(name +" "+ "i value: "+ i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	

}
