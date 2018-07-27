package com.murzyn;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService){
        this.fortuneService=theFortuneService;
    }

    public TrackCoach(){

    }

    @Override
    public String getDailyWorkout() {
        return "Przebiegnij 5 km";
    }

    @Override
    public String getDailyFortune() {
        return "Just do It" + fortuneService.getFortune();
    }

    public void doMyStartupStuff(){
        System.out.println("TC: inside DMSS");
    }

    public void doMyCleanupStuffYoYo(){
        System.out.println("TC: inside DMcSyy");
    }

}

