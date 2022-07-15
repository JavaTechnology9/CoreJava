package com.core07.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationExample {
	@MyAnno
	@MyMarker
	@MySingle(value=250)
	public static void myMeth(String msg, int val) { //called
		try {
			AnnotationExample example = new AnnotationExample();
			Class<?> class1 = example.getClass();
			Method m=class1.getMethod("myMeth", String.class, int.class);
			Annotation[] annotation = m.getAnnotations();
			if(m.isAnnotationPresent(MyMarker.class)) {
				System.out.println("MyMarker annotation is present");
			}
			for(Annotation anno: annotation) {
				
				if(anno instanceof MyAnno) {
					MyAnno an=(MyAnno)anno;
					System.out.println(an.str() + " " + an.val());
				}if(anno instanceof MySingle) {
					MySingle an=(MySingle)anno;
					System.out.println(an.value());
				}
				
			}
			  
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		myMeth("Pass", 25);// calling this myMeth method
	}

}
