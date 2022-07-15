package com.core07.annotation;

public class BoundedType<T extends Number> {
	T[] nums;
	public BoundedType(T[] nums) {
		this.nums=nums;
	}
	double average() {
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i].doubleValue(); // sum=sum+C
		return sum/nums.length;
	}
	boolean sameAvg(BoundedType<?> vals) {
		if(average()==vals.average()) return true;
		else return false;
	}
	public static void main(String[] args) {
		Integer iValues[]= {10,45,96,78,32,12,63}; // byte, short, int and long
		BoundedType<Integer> bt=new BoundedType<>(iValues); //int 
		System.out.println(bt.average());
		Double dvals[]= {12.0,45.0,78.2,96.3,41.7,52.1}; //double 
		BoundedType<Double> btD=new BoundedType<>(dvals);
		if(btD.sameAvg(bt))
			System.out.println("both are same.");
		else 
			System.out.println("both are difference");
		//int in=new int();
		Integer in=new Integer(10);
		
		//String strs[]= {"AB", "BC","CD"};
		//BoundedType<Number> btS=new BoundedType<>(strs);
	}
}
