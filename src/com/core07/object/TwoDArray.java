package com.core07.object;

public class TwoDArray {

	public static void main(String[] args) {
		int twoD[][]=new int[3][4];
		int k=0;
		/*for(int i=0; i<3;i++) {
			for(int j=0;j<4;j++) {
				twoD[i][j]=k;
				k++;
			}
		}*/
		twoD[0][0]=0;
		twoD[0][1]=1;
		twoD[0][2]=2;
		twoD[0][3]=3;
		twoD[1][0]=4;
		twoD[1][1]=5;
		twoD[1][2]=6;
		twoD[1][3]=20;
		twoD[2][0]=8;
		twoD[2][1]=9;
		twoD[2][2]=10;
		twoD[2][3]=23;
		
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<4;j++) 
				System.out.print(twoD[i][j]+ " ");
			System.out.println();
				
			
		}

	}

}
