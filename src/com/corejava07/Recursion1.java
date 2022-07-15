package com.corejava07;

public class Recursion1 {
	public static int sum(int k) {
		if(k>0) {
			return sum(k-1)+k;
		}else 
			return 0;
		
	}

	public static void main(String[] args) {
		System.out.println(sum(10));

	}
	/*10 + sum(9)
	10 + ( 9 + sum(8) )
	10 + ( 9 + ( 8 + sum(7) ) )*/

}
