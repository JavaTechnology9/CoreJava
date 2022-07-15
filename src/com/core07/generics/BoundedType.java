package com.core07.generics;

public class BoundedType<T extends Number> {
	T[] nums;
	public BoundedType(T[] o) {
		nums=o;
	}
	double average() {
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i].doubleValue();
		return sum/nums.length;
	}
	boolean sameAvg(BoundedType<?> ob) {
		if(average()==ob.average()) return true;
		else return false;
	}

}
