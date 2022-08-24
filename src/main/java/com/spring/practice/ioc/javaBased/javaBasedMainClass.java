package com.spring.practice.ioc.javaBased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class javaBasedMainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.practice.ioc.javaBased");
        Date date = context.getBean("date",Date.class);
        System.out.println("Date : "+date);

        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();
        context2.scan("com.spring.practice.ioc.javaBased");
        context2.refresh();

        AnnotationConfigApplicationContext context3 = new AnnotationConfigApplicationContext();
        context3.scan("com.spring.practice.ioc.javaBased");
        context3.refresh();
    }
}
