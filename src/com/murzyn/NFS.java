package com.murzyn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NFS {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("footballCoach", Coach.class);

        System.out.println(myCoach.getDailyFortune());

        context.close();
    }
}
