package com.murzyn;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(){

    }

    public FootballCoach(FortuneService fortuneService) {
      this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Just score a goal";
    }

    @Override
    public String getDailyFortune(){
        return  fortuneService.getFortune();
    }
}
