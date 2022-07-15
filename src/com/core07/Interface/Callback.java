package com.core07.Interface;

public interface Callback {
	
	  int value=10; 
	//llegal modifier for the interface field Callback.value; 
	//only public, static & final are permitted
	   private void show() {
		   System.out.println("method inside interface");
	   }
	   void call(int param);
	   //private void callback();
	   //llegal modifier for the interface method call; 
	   //only public, private, abstract, default, static 
	   default void test() {
		   show();
	   }
	   static class InClass{
		   int val=250;
		   void nestedMethod() {
			   System.out.println("Interface value: "+ value);
			  
		   }
	   }

}
