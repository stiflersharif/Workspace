package com.jarvis.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	@Autowired
	@Qualifier("REST")
	private FortuneService cricketfortune;

	@Override
	public String getDailyWorkout() {
		
		return "Prepare for the cup";
	}

	@Override
	public String getDailyFortune() {
		
		return cricketfortune.getFortune();
	}

}
