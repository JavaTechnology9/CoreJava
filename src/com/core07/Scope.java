package com.core07;

public class Scope {

	public static void main(String[] args) {
		int x;
		for(x=0;x<3;x++) {
			int y=-1;
			System.out.println("y is: " +y);
			y=100;
			System.out.println("y is now:  "+ y);
		}
		/*int x;
		x=10;
		int y;
		if(x==10) {
			 y=20;
			System.out.println("x and y values: "+ x+ " "+y);
			x=40;
			y=100;
		}
		y=100;
		x=200;
		System.out.println("x and y values: "+ x+ " "+y);*/
	}

}
