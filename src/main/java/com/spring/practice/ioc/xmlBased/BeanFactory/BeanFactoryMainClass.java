package com.spring.practice.ioc.xmlBased.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryMainClass {
    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beanfactory.xml"));
         Employee emp = factory.getBean("emp", Employee.class);

        System.out.println("Employee id: " +emp.getEmpid()+" name: "+emp.getEmpName());
    }
}
