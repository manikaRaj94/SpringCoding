package com.spring.practice.ioc.annotationBased.autoWiring;

import org.springframework.stereotype.Component;

@Component
public class Dell implements  Laptop{
    @Override
    public void hardDisk() {
        System.out.println("==Dell HardDisk==");
    }
}
