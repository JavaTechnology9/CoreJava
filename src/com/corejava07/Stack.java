package com.corejava07;

public class Stack {
	private int stck[];
	private int tos;
	private int size;
	
	Stack(int size) {
		stck=new int[size];
		tos=-1;
		this.size = size;
	}
	void push(int item) {
		if(tos==stck.length-1)
			System.out.println("Stack is full");
		else
			stck[++tos]=item;
	}
	int pop() {
		if(tos<0) {
			System.out.println("Stack is underflow");
			return 0;
		}else
			return stck[tos--];
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	

}
