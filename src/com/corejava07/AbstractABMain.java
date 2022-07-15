package com.corejava07;

import com.facebook.database.FixedStack;
import com.facebook.database.IntStack;
import com.facebook.database.NestedClass;
import com.facebook.database.NestedClassImpl;

public class AbstractABMain {

	public static void main(String[] args) {
		/*AbstractB ab=new AbstractB();
		ab.callme();
		ab.callmetoo();
		System.out.println(ab.value);*/
		
		/*Client c1=new Client();
		c1.callback(12);
		c1.nonIfaceMeth();
		
		Callback c2=new AnotherClient();
		c2.callback(78);*/
		/*NestedClass.NestedIF nc=new NestedClassImpl();
		System.out.println(nc.isNotNegative(45));*/
		IntStack is=new FixedStack(5);
		is.clear();
		for(int i=0; i<20;i++)is.push(i*3);
		for(int i=0; i<20;i++)System.out.print(is.pop() +" ");
		
	}

}
