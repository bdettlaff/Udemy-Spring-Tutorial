package com.murzyn;

import java.util.Random;

public class NewFortuneService implements FortuneService {

    public String[] fortunes = {"GJ", "Well done", "Gitara siema"};

    @Override
    public String getFortune() {
        Random generator = new Random();
        int randomNumber = generator.nextInt(3);
        return fortunes[randomNumber];
    }
}
