package com.core07.lambda;

public class NFuncImpl implements NumaricFunc{

	@Override
	public int func(int n) {
		int result=1;
		for(int i=1; i<=n;i++)
			result=i*result;
		return result;
	}
	public static void main(String[] args) {
		NFuncImpl im=new NFuncImpl();
		System.out.println(im.func(3));
	}

}
