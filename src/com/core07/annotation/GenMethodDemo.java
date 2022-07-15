package com.core07.annotation;

import com.core07.Inheritance.Box;

public class GenMethodDemo {
	private float val;
	public <T extends Number> GenMethodDemo(T x) {
		val=x.floatValue();
	}
	static <T extends Comparable<T>, V extends T>boolean isIn(T x, V[] v) {
		for(int i=0; i<v.length;i++)
			if(v[i].equals(x)) return true;
		return false;
	}
	public static void main(String[] args) {
		Integer iarr[]= {45,78,96,36,52,85,41,14,47};
		if(isIn(47,iarr)) System.out.println("47 is available in iarr array");
		else System.out.println("47 is not available in iarr array");
		String sarr[]= {"ab", "bc", "cd", "de","ef"};
		if(isIn("abc",sarr)) System.out.println("ab is available in String array");
		else System.out.println("ab is not available in String array");
		
		Box boxArr[]= {new Box(), new Box(12.12), new Box(12.45,78.1), new Box(78.4,96.3,85.2)};
		System.out.println(boxArr.length);
		/*Box box = new Box();
		if(isIn(box, boxArr)) System.out.println("new Box() is available in Box Array" );
		else System.out.println("new Box() is not available in Box Array");*/
	}

}
