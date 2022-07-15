package com.core07.Enumerations;

import java.util.Random;

public class Question {
	Random random=new Random();
	
	Answers ask() {
		int randomValue=random.nextInt();
		System.out.println(randomValue);
		if(randomValue>15)
			return Answers.MAYBE;
		else if(randomValue>30)
			return Answers.LATER;
		else if(randomValue<15)
			return Answers.NEVER;
		else if(randomValue<30)
			return Answers.NO;
		else
			return Answers.YES;
	}
	public static void main(String[] args) {
		Question q=new Question();
		System.out.println(q.ask());
	}

}
