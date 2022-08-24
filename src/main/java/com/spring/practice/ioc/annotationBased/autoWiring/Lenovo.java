package com.spring.practice.ioc.annotationBased.autoWiring;

import org.springframework.stereotype.Component;

@Component
public class Lenovo  implements  Laptop{
    @Override
    public void hardDisk() {
        System.out.println("==Lenovo HardDisk==");
    }
}
