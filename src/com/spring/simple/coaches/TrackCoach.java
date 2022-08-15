package com.spring.simple.coaches;

import com.spring.simple.FortuneService;

public class TrackCoach implements Coach {
	
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
}
