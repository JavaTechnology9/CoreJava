package com.core07.multithreading;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Current Thread: "+ thread);
		thread.setName("myThread");
		thread.setPriority(8);
		System.out.println("After the name change: "+thread);
		try {
			for(int i=0;i<5;i++) {
				System.out.println("i value: "+ i);
				Thread.sleep(5);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
