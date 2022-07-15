package com.corejava07;

import com.corejava07.Outer.Inner;

public class PrivateAccessControlMain {

	public static void main(String[] args) {
		/*PrivateAccessControl pac =new PrivateAccessControl();
		pac.a=10;
		pac.b=20;
		pac.setC(45);
		System.out.println("a,b and c " + pac.a+ " " +pac.b+ " "+pac.getC());*/
		/*Stack stck1=new Stack(45);
		Stack stck2=new Stack(40);
		for(int i=0;i<stck1.getSize();i++)stck1.push(i*2);
		//for(int i=0;i<20;i++)stck2.push(i*2);
		
		for(int i=0;i<stck1.getSize();i++)System.out.print(stck1.pop() + " ");*/
		Outer ou=new Outer();
		Outer.Inner in=ou.new Inner();
		in.msg();
	}

}
