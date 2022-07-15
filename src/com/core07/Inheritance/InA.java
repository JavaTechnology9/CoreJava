package com.core07.Inheritance;

public class InA {
	private int i;
	private int j;// variable
	public InA() {
		
	}
	 void showIJ() { // method
		System.out.println("i and i values: "+ i +" " +j);
	}
	void sum() {
		System.out.println(i+j);
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public static void main(String[] args) {
		InA ia=new InA();
		ia.i=15;
		ia.j=25;
		ia.showIJ();
	}

}
