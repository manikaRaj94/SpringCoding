package com.spring.practice.dependecyInjection.constructorBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstuctorBasedMainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorbased.xml");

        Student student1 = context.getBean("student1",Student.class);
        student1.getStudentdetails();
    }
}
