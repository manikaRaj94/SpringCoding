package com.spring.practice.ioc.annotationBased.autoWiring;

import org.springframework.stereotype.Component;

@Component
public class Asus implements  Laptop{
    @Override
    public void hardDisk() {
        System.out.println("==Asus HardDisk==");
    }
}
