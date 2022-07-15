package com.corejava07;

public class BoxDemo {
	public static void main(String[] args) {

		Box box1;// declaration
		 box1=new Box(15,20,10);// create Box object box  initialization
		Box box2=new Box(12);//new Box();
		Box box3=new Box(12,45);//new Box();
		Box box4=new Box(box1);//new Box();
		Box box5=box1;
		/*box1.depth=10;
		box1.height=20;
		box1.width=15;*/
		//box1.setValues(15, 20, 10);
		box4.setValues(13,16,19);
		System.out.println(" box1: " +box1.volume());
		System.out.println(" box2: " +box2.volume());
		System.out.println(" box3: " +box3.volume());
		System.out.println(" box4: " +box4.volume());
	
		//System.out.println(vol);
		//System.out.println(box1.width);
		/*box2.width=3;
		box2.height=6;
		box2.depth=9;*/
		
		//double vol1=box2.volume();
		//System.out.println(vol1);
		/*System.out.println(box1.width);
		System.out.println(box2.width);*/
		//System.out.println(depth);

	}
	

}
