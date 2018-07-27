package com.murzyn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach theCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == myCoach);

        System.out.println(result);
        System.out.println("TheCoach: " + theCoach);
        System.out.println("myCoach: " + myCoach);

        context.close();

    }
}
