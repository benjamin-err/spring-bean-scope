package com.spring.simple;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Be happy and do good things!";
	}

}
