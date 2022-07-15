package com.core07.object;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
//@What
public class Meta2 {
	@MyAnno(str="Two Parameters", val=25)
	@What(description="custom method properties")
	@MyMarker
	public static void anno2(String str, int val) {
		Meta2 me=new Meta2();
		Class<? extends Meta2> class1 = me.getClass();
		try {
			Method method = class1.getMethod("anno2", String.class, int.class);
			if(method.isAnnotationPresent(MyMarker.class)) {
			Annotation[] annotation = method.getAnnotations();
			for (Annotation annotation2 : annotation) {
				if(annotation2 instanceof MyAnno) {
					MyAnno anno=(MyAnno)annotation2;
					System.out.println(anno.str()+ " " + anno.val());
				}
				if(annotation2 instanceof What) {
					What anno=(What)annotation2;
					System.out.println(anno.description());
				}
				//System.out.println(annotation2);
			}
			}
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		anno2("custom annotation", 25);
	}

}
