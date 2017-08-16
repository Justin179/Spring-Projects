package com.samplecodebase.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach(){
		
	}

	@Override
	public String getDailyworkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "TrackCoach: "+fortuneService.getFortune();
	}

}
