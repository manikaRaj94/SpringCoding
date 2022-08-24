package com.spring.practice.ioc.javaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class dateConfiguration {

   // @Scope("prototype")   // bedefault it is singleton . so will create the object at time of initialization
    @Bean(name = "date")
    public Date getCurrentDate(){
        Date da = new Date();
        System.out.println("Inside getDate()");
        return da;
    }
}
