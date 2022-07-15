package com.facebook.Enum;

import java.util.Random;

public class QuestionEnum {
	
	static Answers ask() {
		Random random=new Random();
		int ran=random.nextInt();
		if(ran<15) {
			return Answers.MAYBE;
		}else if(ran<30) {
			return Answers.NO;
		}else if(ran<45) {
			return Answers.YES;
		}else {
			return Answers.NEVER;
		}
	}

	public static void main(String[] args) {
		//System.out.println(ask());
		
		

	}

}
