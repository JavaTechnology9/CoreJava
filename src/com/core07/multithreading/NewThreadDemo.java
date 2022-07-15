package com.core07.multithreading;

public class NewThreadDemo {

	public static void main(String[] args) {
		/*for(int i=0;i<15;i++) {
			new NewThread("One"+i);
		}*/
		NewThread t1=new NewThread("One");
		NewThread t2=new NewThread("Two");
		NewThread t3=new NewThread("Three");
		System.out.println("Thread one is alive: " + t1.t.isAlive());
		System.out.println("Thread Two is alive: " + t2.t.isAlive());
		System.out.println("Thread Three is alive: " + t3.t.isAlive());
		
		try {
			for(int i=0;i<5;i++) {
				t1.t.join(5000);
				t2.t.join(2000);
				t3.t.join(3000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread one is alive after run method call: " + t1.t.isAlive());
		System.out.println("Thread Two is alive after run method call: " + t2.t.isAlive());
		System.out.println("Thread Three is alive after run method call: " + t3.t.isAlive());

	}

}
