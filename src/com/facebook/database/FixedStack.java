package com.facebook.database;

public class FixedStack implements IntStack{
	private int stck[];
	private int tos;
	public FixedStack(int size) {
		stck=new int[size]; //10
		tos=-1;
	}
	@Override
	public void push(int item) {
		if(tos==stck.length-1) {
			int temp[]=new int[stck.length * 2];
			for(int i=0;i<stck.length;i++) temp[i]=stck[i];
			stck=temp;
			stck[++tos]=item;
		}
		else
			stck[++tos]=item;
		
	}

	@Override
	public int pop() {
		if(tos<0) {
			System.out.println("Stack is underflow");
			return 0;
		}else
			return stck[tos--];
	}

}
