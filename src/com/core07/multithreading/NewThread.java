package com.core07.multithreading;

public class NewThread implements Runnable {
	Thread t;
	private String name;
	public NewThread(String name) {
		// create second thread
		t=new Thread(this, name);
		this.name=name;
		System.out.println("child thread :"+ t);
		t.start();
	}

	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				//Thread.dumpStack();
				System.out.println("child thread i value: "+ i+ "Child Thread: " + name);
				Thread.sleep(5000);
			}
			int count=Thread.activeCount();
			System.out.println(count);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
