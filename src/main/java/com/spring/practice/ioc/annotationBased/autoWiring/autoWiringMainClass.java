package com.spring.practice.ioc.annotationBased.autoWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class autoWiringMainClass {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.practice.ioc.annotationBased.autoWiring");
        User userObj = context.getBean("user",User.class);
        userObj.callHardDisk();
    }
}
