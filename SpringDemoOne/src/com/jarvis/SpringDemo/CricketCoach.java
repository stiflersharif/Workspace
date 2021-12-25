package com.jarvis.SpringDemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public String getEmail() {
		System.out.println("Get Email");
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Set Email");
		this.email = email;
	}


	public String getTeam() {
		System.out.println("Get Team");
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Set Team");
		this.team = team;
	}


	public CricketCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Cricket coach for you");
	}
		
	
//	public FortuneService getFortuneService() {
//		System.out.println("Cricket coach setter for you");
//		return fortuneService;
//	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach setter for you");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice straight drive for 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricket: " + fortuneService.getFortune();
	}

}
