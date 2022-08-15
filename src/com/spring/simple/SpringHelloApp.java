package com.spring.simple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.simple.coaches.BaseballCoach;
import com.spring.simple.coaches.Coach;

public class SpringHelloApp {
	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);
		
		// calling methods
		System.out.println("-- Track Coach --");
		System.out.println(trackCoach.getDailyFortune());
		

		System.out.println("-- Baseball Coach --");
		System.out.println(baseballCoach.getDailyFortune());
		System.out.println("Team name: " + baseballCoach.getBaseballTeamName());
		System.out.println("Color of the team: " + baseballCoach.getTeamColor());
		
		// closing the context
		context.close();
	}


}
