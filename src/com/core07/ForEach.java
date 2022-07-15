package com.core07;

public class ForEach {

	public static void main(String[] args) {
		int sum=0;
		int nums[]= {10,45,65,98,74,68,63,21,47,89};
		for(int x:nums) {
			System.out.println("x value: "+x);
			sum+=x;
			if(x==63) break;
		}
		System.out.println("for-each: "+sum);
		/*int nums[]= {10,45,65,98,74,68,63,21,47,89};
		int sum=0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i];
		System.out.println("for loop: "+sum);
		sum=0;
		// for(type itr-var:collections)  for-each JDK 1.5
		for(int x:nums)
			sum+=x;
		System.out.println("for-each: "+sum);*/
	}

}
