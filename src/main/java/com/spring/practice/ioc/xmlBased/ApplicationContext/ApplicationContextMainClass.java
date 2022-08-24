package com.spring.practice.ioc.xmlBased.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextMainClass
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextFileSystem.xml");
        Address add = context.getBean("addr",Address.class);

        System.out.println("Addr : "+add.getFlatNo()+add.getApartmentNo());


    }
}
