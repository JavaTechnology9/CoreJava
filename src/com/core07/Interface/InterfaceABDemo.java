package com.core07.Interface;

public class InterfaceABDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int d=0;
		int a=42/d;
		InterfaceB ib=new InterfaceABImpl();
		ib.meth1();
		ib.meth2();
		ib.meth3();
		System.out.println(ib.getString());
		System.out.println(InterfaceABImpl.getNumber());
		System.out.println(InterfaceB.getNumber());*/
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			int d=0;
			int a=42/d;
			System.out.println("a value: "+a);
			
		}/*catch(ArithmeticException ex) {
			System.out.println("ArithmeticException caught");
		}*/finally {
			InterfaceB ib=new InterfaceABImpl();
			try {
				ib.getClass().forName("InterfaceABImpl");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ib.meth1();
			ib.meth2();
			ib.meth3();
			System.out.println(ib.getString());
			System.out.println(InterfaceABImpl.getNumber());
			System.out.println(InterfaceB.getNumber());
		}
		

	}

}
