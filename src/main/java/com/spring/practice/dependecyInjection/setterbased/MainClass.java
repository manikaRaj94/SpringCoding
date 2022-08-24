package com.spring.practice.dependecyInjection.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setterbased.xml");
        Student student1 = context.getBean("stud",Student.class);

        student1.getDetails();



    }
}
