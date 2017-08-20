package com.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		CricketCoach cc = new CricketCoach();
//		System.out.println( cc.dailyWorkout());
//		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("fc",Coach.class);
		System.out.println(coach.dailyWorkout());
		System.out.println(coach.dailyWorkout());

	}

}
