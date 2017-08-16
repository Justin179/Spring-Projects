package com.samplecodebase.springdemo;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyworkout(){
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneServie to get a fortune
		return fortuneService.getFortune();
	}
}
