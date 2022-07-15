package com.core07.multithreading;

public class Callme {
	 void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			System.out.println("Interrupted.");
		}
		System.out.println("]");
	}

}
