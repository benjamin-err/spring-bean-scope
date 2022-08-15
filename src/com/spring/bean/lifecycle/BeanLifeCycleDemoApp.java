package com.spring.bean.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.simple.coaches.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		// retrieve bean from container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		Coach trackCoach2 = context.getBean("trackCoach", Coach.class);
		
		// comparing reference
		System.out.println(trackCoach.getDailyWorkout());
		
		// closing the context
		context.close();
	}

}
