package com.spring.simple.coaches;

import com.spring.simple.FortuneService;

public class BaseballCoach implements Coach {
	
	private String baseballTeamName;
	private String teamColor;
	
	private final FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getBaseballTeamName() {
		return baseballTeamName;
	}

	public void setBaseballTeamName(String baseballTeamName) {
		this.baseballTeamName = baseballTeamName;
	}

	public String getTeamColor() {
		return teamColor;
	}

	public void setTeamColor(String teamColor) {
		this.teamColor = teamColor;
	}
	
	
}
