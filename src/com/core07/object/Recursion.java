package com.core07.object;

public class Recursion {
	static int fact(int n) {
		int result;
		if(n==1) return 1;
		result=fact(n-1)*n;
		return result;
	}
	static int rec(int i) {
		return i+=2;
	}
	public static void main(String[] args) {
		/*int result=rec(10)*4;
		System.out.println(result);
		System.out.println("Factorial of 3 is: "+ fact(3));
		System.out.println("Factorial of 4 is: "+ fact(4));
		System.out.println("Factorial of 5 is: "+ fact(5));
		
			Stack s1=new Stack();
			//System.out.println(s1.stck);
			for(int i=0;i<10;i++)s1.push(i*2);
			for(int i=0;i<10;i++)System.out.print(s1.pop() + " ");*/
			
				 UseStatic us=new UseStatic();
				 us.nonStatic(72);
				UseStatic.meth(45);
				//UseStatic.a=78;
				System.out.println(UseStatic.a);
				System.out.println(UseStatic.b);
			
		
	}

}
