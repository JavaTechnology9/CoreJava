package com.core07.generics;

public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T>{
	T[] vals;
	public MinMaxImpl(T[] o) {
		vals=o;
	}
	@Override
	public T min() {
		T v=vals[0];
		for(int i=1;i<vals.length ;i++)
			if(vals[i].compareTo(v)<0) v=vals[i];
		return v;
	}

	@Override
	public T max() {
		T v=vals[0];
		for(int i=1;i<vals.length ;i++)
			if(vals[i].compareTo(v)>0) v=vals[i];
		return v;
	}
	public static void main(String[] args) {
		Integer inums[]= {45,96,78,74,14,36,85,23};
		Character chs[]= {'A','B','C','D','E'};
		MinMaxImpl<Integer> impl1=new MinMaxImpl<>(inums);
		MinMaxImpl<Character> impl2=new MinMaxImpl<>(chs);
		System.out.println(impl1.min());
		System.out.println(impl1.max());
		
		System.out.println(impl2.min());
		System.out.println(impl2.max());
	}

}
