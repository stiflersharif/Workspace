package com.jarvis.SpringAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ScopeAppContexr {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach mycoach = context.getBean("cricketCoach",Coach.class);
		
		System.out.println(mycoach.getDailyWorkout());
		System.out.println(mycoach.getDailyFortune());
		context.close();

	}

}
