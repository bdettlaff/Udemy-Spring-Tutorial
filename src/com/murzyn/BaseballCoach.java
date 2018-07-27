package com.murzyn;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService){
        this.fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "30 minut na bieganiu";
    }

    @Override
    public String getDailyFortune(){


        return  fortuneService.getFortune();
    }
}
