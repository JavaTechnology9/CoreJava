package com.facebook.config;

public class Derived extends Protection{
	Derived(){
		System.out.println("derived constructor");
		System.out.println("n value: " +n);
		//System.out.println("n_pri value: " +n_pri);
		System.out.println("n_pro value: " +n_pro);
		System.out.println("n_pub value: " +n_pub);
	}

}
