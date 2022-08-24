package com.spring.practice.ioc.javaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class stringConfiguration {

    @Bean(name="stringConfig")
    public String getValueOfString()
    {
        int i=10;
        System.out.println("Inside getValueOfString()");
        String str = String.valueOf(i);
        return str;
    }
}
