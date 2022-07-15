package com.facebook.controller;

public class AccountBalance {
	public static void main(String[] args) {
		Balance current[]=new Balance[3];
		current[0]=new Balance("Joseph", 45.52);
		current[1]=new Balance("Matthew",96.41);
		current[2]=new Balance("Tom Jackson", 85.67);
		for(Balance bal:current)
			bal.show();
		
	}

}
