package com.spring.practice.dependecyInjection.constuctorsetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorSetterBasedClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorSetterBased.xml");

        Employee emp1 = context.getBean("emp1",Employee.class);
        emp1.getDetails();
    }
}
