package com.core07.multithreading;

public class PQDemo {

	public static void main(String[] args) {
		PQ target=new PQ();
		new Producer(target);
		new Consumer(target);

	}

}
