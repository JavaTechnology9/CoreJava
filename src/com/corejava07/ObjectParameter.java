package com.corejava07;

public class ObjectParameter {
	int a,b;
	public ObjectParameter(int i, int j) {
		a=i;
		b=j;
	}
	boolean equalsTo(ObjectParameter o) {
		System.out.println(o);
		o.a=78;
		if(o.a== a && o.b==b)return true;
		else return false;
	}
	public static void main(String[] args) {
		ObjectParameter op=new ObjectParameter(100,200);
		ObjectParameter op1=new ObjectParameter(45,65);
		ObjectParameter op2=new ObjectParameter(100,200);
		System.out.println(op1);
		System.out.println("op==op1 " +op.equalsTo(op1));
		
		
	}

}
