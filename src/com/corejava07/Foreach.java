package com.corejava07;

public class Foreach {

	public static void main(String[] args) {
		int nums[]= {10,20,30,40,50,60,70,80,90};
		int sum=0;
		for(int i=0;i<nums.length;i++)sum+=nums[i];
		System.out.println(sum);
		
		for(int x:nums) {
			System.out.println("Value is: "+x);
			sum+=x;
			if(x==50)break;
		}
		System.out.println(sum);
		/*int i,j;
		for(i=0;i<10;i++) {
			for(j=0;j<i;j++)
				System.out.print("*");
			System.out.println();*/
		}

	}

//}
