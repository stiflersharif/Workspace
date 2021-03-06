package com.jarvis.SpringDemo;

public class Tennis implements Coach{
	// define a private field for dependency
	private FortuneService fortuneService;
	public Tennis(FortuneService theFoturneService) {
		fortuneService = theFoturneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "hit 10 Wide Serves";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get Fortune
		return fortuneService.getFortune();
	}


}
