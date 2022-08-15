package com.spring.simple;

import java.util.Random;

public class RadnomFortuneService implements FortuneService {

	private final String [] fortunes = new String[] {
			"Believe it can be done.",
			"Courtesy is contagious.",
			"Don’t just spend time. Invest it.",
			"Distance yourself from the vain.",
			"Do not be intimidated by the eloquence of others.",
			"Do not demand for someone’s soul if you already got his heart.",
			"Do not let ambitions overshadow small success.",
			"Do not make extra work for yourself.",
			"Do not underestimate yourself. Human beings have unlimited potentials.",
			"Do you know that the busiest person has the largest amount of time?",
			"Don’t be discouraged, because every wrong attempt discarded is another step forward.",
			"Don’t confuse recklessness with confidence."
	};
	
	
	
	@Override
	public String getFortune() {
		return fortunes[new Random().nextInt(fortunes.length)];
	}

}
