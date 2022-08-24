package com.spring.practice.springAOP.advices.main;

import com.spring.practice.springAOP.advices.dao.StudentDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPMainClass {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.practice.springAOP");

        StudentDAO studentDAO = context.getBean("studentImpl",StudentDAO.class);


        System.out.println("Student  : "+studentDAO.getStudent(4));
    }
}
