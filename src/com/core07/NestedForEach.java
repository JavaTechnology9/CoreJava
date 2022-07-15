package com.core07;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class NestedForEach {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<10;i++) {
			for(j=i;j<10;j++)
				System.out.print("*");
			System.out.println();
		}
		//HashMap<K, V>
		//ConcurrentHashMap<K, V>
		/*int sum=0;
		int nums[][]=new int[3][4];
		for(int i=0;i<3;i++) {// outer for loop
			for(int j=0;j<4;j++) {// nested for loop
				nums[i][j]=(i+1)*(j+1);
			}
		}
		for(int x[]: nums) {
			for(int y:x) {
				System.out.println("y value: " +y);
				sum+=y;
			}
		}
		System.out.println("sum: "+ sum);*/

	}

}
