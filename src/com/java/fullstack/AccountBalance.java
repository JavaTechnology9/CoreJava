package com.java.fullstack;

public class AccountBalance {

	public static void main(String[] args) {
		Balance current[]=new Balance[3];
		current[0]=new Balance("Joseph", 123.456);
		current[1]=new Balance("will Tell", 784.12);
		current[2]=new Balance("Tom Jackson", 965.54);
		//current[3]=new Balance("Tom Jackson", 965.54);
		for(int i=0;i<current.length;i++)current[i].show();

	}

}
