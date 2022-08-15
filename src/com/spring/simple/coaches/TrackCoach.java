package com.spring.simple.coaches;

import org.springframework.beans.factory.DisposableBean;

import com.spring.simple.FortuneService;

public class TrackCoach implements Coach, DisposableBean {
	
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	// add an init method
	public void initStuff() {
		System.out.println("Track Coach init method");
	}
	
	public void cleanUpStuff() {
		System.out.println("Track Coach cleaning up method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method is called on following bean: " + this);
	}
}
