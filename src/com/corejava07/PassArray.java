package com.corejava07;

public class PassArray {
	static void vaTest(int ...v) {
		System.out.print("vaTest(int ...v) Number of args: " + v.length + " Contents: ");
		
		for(int x : v) 
			System.out.print(x +" ");
		System.out.println();
		
	}
	static void vaTest(boolean ...v) {
		System.out.print("vaTest(boolean ...v) Number of args: " + v.length + " Contents: ");
		
		for(boolean x : v) 
			System.out.print(x +" ");
		System.out.println();
		
	}
	static void vaTest(String msg,int ...v) {
		System.out.print(msg  + v.length + " Contents: ");
		
		for(int x : v) 
			System.out.print(x +" ");
		System.out.println();
		
	}
	public static void main(String[] args) {
		/*int n1[]= {10};
		int n2[]= {10,20,30,40,50,60};
		int n3[]= {};*/
		vaTest("Five varargs: ",10,20,45,78,96);
		vaTest("Seven varargs: ",10,20,30,40,50,60,70);
		vaTest("One varargs: ",25);
		vaTest(10,45,63,25,41);
		vaTest(false,true,true,false);
	}

}
