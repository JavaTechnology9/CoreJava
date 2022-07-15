package com.core07;

public class RelationOperators {

	public static void main(String[] args) {
		int i,k;
		i=10;
		k=i<=10?-i:i;
		System.out.println(i + " is "+ k);
		double da=45.12;
		double db;
		db=da==45.78?da:-da;
		System.out.println(db);
		/*int x,y,z;
		x=100;y=200;z=300;
		x=y=z=100;
	
		int a=23;
		int b=25;
		if(a>b || a<b) {
			System.out.println("a<b");
		}
		if(++a>=--b || a>b) { // a=a+1
			System.out.println("a<=b");
		}
		boolean ab=false;
		boolean bb=false;
		if(ab&& bb) {
			System.out.println("ab && bb");
		}
		if(ab || bb) {
			System.out.println("ab || bb");
		}*/

	}

}
