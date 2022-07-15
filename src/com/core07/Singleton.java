package com.core07;


public class Singleton {
	private Singleton instance;
	
	private Singleton() {
		
	}
	public Singleton getInstance() {
		if(instance==null) {
			instance= new Singleton();
		}
		return instance;
	}

}
