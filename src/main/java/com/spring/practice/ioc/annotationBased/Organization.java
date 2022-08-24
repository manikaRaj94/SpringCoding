package com.spring.practice.ioc.annotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("org")
public class Organization {

    private int orgID;
    private String organizationName;

    @Autowired
    private Employee emp;

    public void getOrganizationDetails()
    {
        System.out.println("Organization ID : "+orgID);
        System.out.println("Organization Name : "+organizationName);
        emp.getEmployeeDetails();
    }

}
