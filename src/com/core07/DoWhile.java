package com.core07;

public class DoWhile {

	public static void main(String[] args) {
		/*int n=10;
		do {
			System.out.println("tick: "+n);
		
		}while(--n>0);*/
		int a,b;
		//for(int x=0;x<10;x++)
		for(a=1,b=20;a<b;a++,b--) {
			System.out.println(a+" : "+ b);
		}
		a=0;
		boolean done=false;
		for(;!done;) {
			System.out.println("a value: "+a);
			if(a==10) done=true;
			a++;
		}
		for(; ;) {
			System.out.println(a++);
		}
		

	}

}
