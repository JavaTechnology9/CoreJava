package com.core07.object;

public class BoxDemoMain {

	public static void main(String[] args) {
		Box box=new Box(15,20,10);
		Box box2=new Box(15,20);
		Box box3=new Box(15);
		Box box4=new Box();
		//Box box2=new Box(-14,-63,-52);
		//Box box3=new Box(-32,-12,-21);
		/*box.width=15;
		box.height=20;
		box.depth=10;
		box.color=78;*/
		/*System.out.println(box.getDepth());
		System.out.println(box.getWidth());
		System.out.println(box.getHeight());*/
		box.setValues(15, 20, 10);
		System.out.println(box.getDepth());
		System.out.println(box.getWidth());
		System.out.println(box.getHeight());
		box.volume(); // calling
		int square = box.square(10);
		System.out.println(square);
		
		/*box2.width=3;
		box2.height=6;
		box2.depth=9;*/
		/*box2.setValues(3, 6, 9);
		System.out.println("=================");
		System.out.println(box2.getWidth());
		System.out.println(box2.getHeight());
		System.out.println(box2.getDepth());
		box2.volume();
		System.out.println(box2.square(15));
		System.out.println("=================");
		box3.width=13;
		box3.height=16;
		box3.depth=19;
		box3.setValues(13, 16, 19);
		System.out.println(box3.getDepth());
		System.out.println(box3.getWidth());
		System.out.println(box3.getHeight());
		box3.volume();
		System.out.println(box3.square(20));
		System.out.println("=================");
		System.out.println(box.getDepth());
		System.out.println(box.getWidth());
		System.out.println(box.getHeight());
		System.out.println(box);
		System.out.println(box3);*/
		
		 

	}

}
