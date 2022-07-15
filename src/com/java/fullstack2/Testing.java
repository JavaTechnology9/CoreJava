package com.java.fullstack2;

import com.java.fullstack2.Test.Yes;

public class Testing implements Yes{

	@Override
	public void show() {
		System.out.println("show method of interface");
		
	}
public static void main(String[] args) {
	new Testing().show();
}
}
