package com.jarvis.SpringDemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {		
		
	}
	public TrackCoach(FortuneService fortuneService) {		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just DO it " + fortuneService.getFortune();
	}
	
	// add init method
	public void doMyStartupStuff() {
		System.out.println("Do my startup stuff");
	}
	// add destroy method
	public void doMyCleanupStuff() {
		System.out.println("Do my cleanup stuff");
	}
}
