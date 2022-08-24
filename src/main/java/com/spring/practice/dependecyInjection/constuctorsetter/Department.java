package com.spring.practice.dependecyInjection.constuctorsetter;

public class Department {
    private String deptID;
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public void getDepartmentDetails()
    {
        System.out.println("Department ID : "+deptID);
        System.out.println("Department Name : "+departmentName);
    }
}
