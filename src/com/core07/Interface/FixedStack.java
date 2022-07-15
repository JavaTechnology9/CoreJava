package com.core07.Interface;

public class FixedStack implements IntStack{
	private int stck[];
	private int tos;
	public FixedStack(int size) {
		this.stck=new int[size];
		this.tos=-1;
	}

	@Override
	public void push(int param) {
		if(tos==stck.length-1) {
			int temp[]=new int[stck.length*2];
			for(int i=0;i<stck.length;i++) temp[i]=stck[i];
			stck=temp;
			stck[++tos]=param;
		}else 
			stck[++tos]=param;
		
	}

	@Override
	public int pop() {
		if(tos<0) {
			//System.out.println("stack is underflow");
			return 0;
		}
		else
			return stck[tos--];
	}

	public int[] getStck() {
		return stck;
	}

	public void setStck(int[] stck) {
		this.stck = stck;
	}
	
	/*@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int i=0; i<stck.length;i++)stck[i]=0;
	}*/

}
