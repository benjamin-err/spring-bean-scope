package com.spring.bean.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.simple.coaches.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from container
		Coach trackCoachOne = context.getBean("trackCoach", Coach.class);
		Coach trackCoachTwo = context.getBean("trackCoach", Coach.class);
		
		// comparing reference
		System.out.println(trackCoachOne == trackCoachTwo);
		
		// displaying the internal mem address
		System.out.println(trackCoachOne);
		System.out.println(trackCoachTwo);
		
		// closing the context
	}

}
