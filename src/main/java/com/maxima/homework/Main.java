package com.maxima.homework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        RecordPlayer radiolist = context.getBean("recordPlayer", RecordPlayer.class);
        radiolist.powerPlayer();

        context.close();
    }
}
