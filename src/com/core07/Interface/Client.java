package com.core07.Interface;

import com.core07.Interface.Callback.InClass;

public class Client implements Callback{

	@Override
	public void call(int param) {
		System.out.println("callback called with: "+param);
		
	}
	void noInmethod() {
		System.out.println("specific Client class method");
	}
	public static void main(String[] args) {
		//Callback back=new Callback();
		Callback back=new Client();
		back.call(25);
		//back.show();
		//back.noInmethod();
		InClass inClass = new Callback.InClass();
		inClass.nestedMethod();
		System.out.println(inClass.val);
	}

}
