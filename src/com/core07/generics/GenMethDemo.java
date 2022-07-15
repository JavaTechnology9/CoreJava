package com.core07.generics;

public class GenMethDemo {
	static <T extends Comparable<T>, V extends T>boolean isIn(T x, V[] y) {
		for(int i=0; i<y.length;i++)
			if(x.equals(y[i])) return true;
		return false;
		
	}
	public static void main(String[] args) {
		Integer nums[]= {12,45,78,96,63,85,52};
		String strs[]= {"One", "Two","Three", "Four","Five","Six"};
		if(isIn(12,nums))
			System.out.println("12 is available in nums");
		if(!isIn(7, nums))
			System.out.println("7 is not available in nums");
		if(!isIn("Seven", strs))
			System.out.println("Seven is not available in String arrays");
		if(isIn("One", strs))
			System.out.println("One is available in String arrays");
		/*if(isIn("One", nums))
			System.out.println("One is available in String arrays");*/
		
	}

}
