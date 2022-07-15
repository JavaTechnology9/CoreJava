package com.facebook.multithreading;

public class PCMain {

	public static void main(String[] args) {
		Stack stck=new Stack();
		new Producer(stck);
		new Consumer(stck);

		System.out.println("Press Control+c to stop");

	}

}
