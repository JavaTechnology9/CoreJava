package com.corejava07;

public class VarArgs {
	/*static void vaTest(int ...v) {
		System.out.print("vaTest(int ...v) Number of args: " + v.length + " Contents: ");
		
		for(int x : v) 
			System.out.print(x +" ");
		System.out.println();
		
	}*/
	static void vaTest(boolean ...v) {
		System.out.print("vaTest(boolean ...v) Number of args: " + v.length + " Contents: ");
		
		for(boolean x : v) 
			System.out.print(x +" ");
		System.out.println();
		
	}

	public static void main(String[] args) {
		//vaTest(10,45,63,25,41);
		vaTest(false,true,true,false);
		vaTest();

	}

}
