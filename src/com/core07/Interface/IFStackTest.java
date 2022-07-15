package com.core07.Interface;

public class IFStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedStack stack=new FixedStack(10);
		for(int i=1;i<25;i++)
			stack.push(i*5);
		for(int i=1;i<25;i++)
			System.out.print(stack.pop()+" ");
		stack.clear();
		System.out.println();
		for(int i=1;i<25;i++)
			System.out.print(stack.pop()+" ");
	}

}
