package com.spring.practice.ioc.annotationBased;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

    private int empID=101;
    private String employeeName="Sant";


    public void getEmployeeDetails()
    {
        System.out.println("Employee ID : "+empID);
        System.out.println("Employee Name : "+employeeName);
    }
}
