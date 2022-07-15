package com.core07.Inheritance;

public class BoxAndBoxWeightMain {

	public static void main(String[] args) {
		/*Box bw1=new BoxWeight(15.1, 25.2, 35.3, 45.4);
		BoxWeight bw2=new BoxWeight(bw1);
		//Box box=new Box(45.7,96.8,56.3);
		bw1.volume();
		//bw2.volume();
		//box.volume();
		System.out.println(bw1.toString());*/
		/*Shipment sh1=new Shipment(12.4,78.5,96.3,74.1,85.2);
		sh1.volume();*/
		//new ConC();
		MethodOverideA moa=new MethodOverideA(45, 78);
		MethodOverideB mob=new MethodOverideB(65,32,98);
		MethodOverideC moc=new MethodOverideC(96,85,74);
		
		MethodOverideA mo; // declaring the object
		mo=moa;
		mo.show();
		mo=mob;
		mo.show();
		mo=moc;
		moc.show();
		
	}

}
