package com.core07.object;

public class Varargs {
	static void vaTest(int ... v) {
		System.out.print("Number of args: " +v.length + " Contents ");
		for(int x:v)
			System.out.print(x+ " ");
		System.out.println();
	}
	static void vaTest(boolean ... v) {
		System.out.print("Number of args: " +v.length + " Contents ");
		for(boolean x:v)
			System.out.print(x+ " ");
		System.out.println();
	}
	static void vaTest(long ... v) {
		System.out.print("Number of long args: " +v.length + " Contents ");
		for(long x:v)
			System.out.print(x+ " ");
		System.out.println();
	}
	static void vaTest() {
		/*System.out.print("Number of args: " +v.length + " Contents ");
		for(boolean x:v)
			System.out.print(x+ " ");*/
		System.out.println("normal vaTest method");
	}
	static void vaTest(String msg,int ... v) {
		System.out.print(msg +" Number of args: " +v.length + " Contents ");
		for(int x:v)
			System.out.print(x+ " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		/*int n1[]= {10};
		int n2[]= {12,45,78,96,45,78,32,41};
		int n3[]= {};*/
		/*vaTest(10,45,63,98);
		vaTest(12,78,63,52,74,41,85,96);
		vaTest(23);*/
		vaTest(1,2,3);
		vaTest("Testing", 10,20);
		vaTest(true, false, false, true);
		vaTest(45,78,96,85);
		
	}
}
