package com.core07.generics;

import com.core07.Inheritance.BoxWeight;

public class NonGenDemo {

	public static void main(String[] args) {
		/*NonGen obj=new NonGen(88);
		obj.showType();
		int value=(Integer)obj.getObj(); //int value=obj.getObj();
		System.out.println(value);
		
		NonGen str=new NonGen("NoGen String object");
		str.showType();
		String val=(String)str.getObj();
		System.out.println(val);*/
		/*TwoGen<Integer, String> instr=new TwoGen<Integer, String>(88, "String parameter");
		instr.showType();
		System.out.println(instr.getObj1());
		System.out.println(instr.getObj2());*/
		
		/*Integer inums[]= {10,20,30,40,50,60};
		BoundedType<Integer> bt=new BoundedType<>(inums);
		System.out.println(bt.average());
		
		Double dnums[]= {45.1,96.2,85.3,74.4,56.7,89.9};
		BoundedType<Double> dbt=new BoundedType<>(dnums);
		System.out.println(dbt.average());
		String snums[]= {"A","B","C","D"};
		//BoundedType<String> sbt=new BoundedType<>(snums);
		BoxWeight bw=new BoxWeight(45.1,78.2,96.3,85.4);
		BoundedType2<BoxWeight> bt2=new BoundedType2<BoxWeight>(bw);
		System.out.println(bt2.vol());*/
		Integer inums[]= {10,20,30,40,50,60};
		BoundedType<Integer> bt=new BoundedType<>(inums);
		System.out.println(bt.average());
		Double dnums[]= {45.1,96.2,85.3,74.4,56.7,89.9};
		BoundedType<Double> dbt=new BoundedType<>(dnums);
		String snums[]= {"A","B","C","D"};
		//BoundedType<String> sbt=new BoundedType<>(snums);
		System.out.println(dbt.average());
		if(bt.sameAvg(dbt))
			System.out.println("Averages are same.");
		else 
			System.out.println("Averages differs.");
		//The method sameAvg(BoundedType<Integer>) 
		//in the type BoundedType<Integer> is not 
		//applicable for the arguments (BoundedType<Double>)
	}

}
