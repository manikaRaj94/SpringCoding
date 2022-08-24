package com.spring.practice.ioc.annotationBased.autoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

@Component
public class User {
    @Autowired
    Laptop asus;

    @Qualifier("dell")
    @Resource
    Laptop laptop;

    @Qualifier("hewlettPackard")
    @Inject
    Laptop lenovo;

    public void callHardDisk()
    {
        asus.hardDisk();
        laptop.hardDisk();
        lenovo.hardDisk();
    }
}
