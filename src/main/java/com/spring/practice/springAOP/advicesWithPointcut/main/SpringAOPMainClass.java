package com.spring.practice.springAOP.advicesWithPointcut.main;

import com.spring.practice.springAOP.advicesWithPointcut.dao.StudentDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPMainClass {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.practice.springAOP.advicesWithPointcut");

        StudentDAO studentDAO = context.getBean("studentImplPointcut", StudentDAO.class);


        System.out.println("Student  : "+studentDAO.getStudent(4));
    }
}
