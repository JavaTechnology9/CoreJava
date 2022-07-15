package com.core07.object;

public class Stack {
	private int stck[];// =new int [10];
	private int tos;
	public Stack(int size) {
		stck=new int[size]; //45
		tos=-1;
	}
	void push(int item) {
		if(tos==stck.length-1) {
			System.out.println("stack is full");
		}else
			stck[++tos]=item;
	}
	int pop() {
		if(tos<0) {
			System.out.println("Stack is underflow.");
			return 0;
		}else
			return stck[tos--];
	}
	
	public int[] getStck() {
		return stck;
	}
	public int getTos() {
		return tos;
	}
	public static void main(String[] args) {
		Stack s1=new Stack(100);
		//System.out.println(s1.stck);
		for(int i=0;i<s1.getStck().length;i++)s1.push(i*2);
		for(int i=0;i<s1.getStck().length;i++)System.out.print(s1.pop() + " ");
	}

}
