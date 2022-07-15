package com.core07.object;

import java.lang.reflect.Method;

public class Meta {
	@MyAnno(str="Annotation Example", val=10)
	public static void anno() {
		Meta me=new Meta();
		try {
			Class<? extends Meta> class1 = me.getClass();
			Method method=class1.getMethod("anno", null);
			MyAnno annotation = method.getAnnotation(MyAnno.class);
			System.out.println(annotation.str()+ " " + annotation.val());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		anno();
	}

}
