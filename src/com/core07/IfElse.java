package com.core07;

public class IfElse {

	public static void main(String[] args) {
		double balance=45.17;
		char ch='A';
		if(balance!=45.17 && ch=='B') {
			System.out.println(balance + " " + ch);
		}else if(balance==45.17 && ch== 'A') {
			System.out.println(balance + " " + ch);
		}else if(balance ==45.17 || ch!='B') {
			System.out.println(balance + " " + ch);
		}
		/*int month=12;
		String season;
		if(month==12|| month==1 || month==2) {
			season="Winter";
		} else if(month==3 || month==4 || month==5) {
			season="Spring";
		}else if(month==6|| month==7 || month==8) {
			season="Summer";
		}else if(month==9 || month==10|| month==11) {
			season="Autumn";
		}else
			season="bogus month";
		System.out.println(season);*/

	}

}
