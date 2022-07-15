package com.core07.Inheritance;

public class SubB extends SuperA{
	int i;
	public SubB(int i, int j) {
		setI(i);
		this.i=j;
	}
	public static void main(String[] args) {
		SubB sb=new SubB(10,20);
		System.out.println(sb.i);
		System.out.println(sb.getI());
	}

}
