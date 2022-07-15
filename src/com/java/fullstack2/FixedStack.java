package com.java.fullstack2;

public class FixedStack implements IntStack {
	private int stck[];
	private int tos;
	public FixedStack(int size) {
		stck=new int[size];
		tos=-1;
	}

	@Override
	public void push(int item) {
		if(tos==stck.length-1)
			System.out.println("stack is full");
		else
			stck[++tos]=item;

	}

	@Override
	public int pop() {
		if(tos<0) {
			System.out.println("stack is underflow");
			return 0;
		}else
			return stck[tos--];
	}
	public static void main(String[] args) {
		FixedStack fs=new FixedStack(10);
		int item=2;
		for(int i=0;i<25;i++)fs.push(item=item*2);
		for(int i=0;i<25;i++)System.out.println(fs.pop());
	}

}
