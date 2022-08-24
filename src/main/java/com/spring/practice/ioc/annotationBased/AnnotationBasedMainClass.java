package com.spring.practice.ioc.annotationBased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBasedMainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.practice.ioc.annotationBased");
        Organization orgObj =context.getBean("org",Organization.class);
      
        orgObj.getOrganizationDetails();
    }
}
