package com.corejava07;

public class DoWhile {

	public static void main(String[] args) {
		/*int n=10;
		do {
			System.out.println("tick value: " + n);
			
		}while(--n>0);*/
		/*int i=1,n=5;
		do {
			System.out.println(i);
		}while(i++<=n);*/
		/*int n;
		for(n=10;n>0;n--)System.out.println("tick value: " + n);*/
		/*int a, b;
		for(a=1,b=4;a<b;) {
			System.out.println("a value: " +a);
			System.out.println("b value: " +b);
		}*/
		int i;
		boolean done=false;
		i=0;
		for(;!done;) {
			System.out.println("i is: " +i);
			if(i==10) done=true;
			i++;
		}
		for(;;)System.out.println("*");
		
	}

}
