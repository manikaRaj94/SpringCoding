package com.spring.practice.dependecyInjection.constuctorsetter;

public class Employee {
    private int empID;
    private String empName;
    private String city;
    private Department department;

    public Employee(int empID, Department department) {
        this.empID = empID;
        this.department = department;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void getDetails()
    {
        System.out.println("Emplyoyee id : "+empID);
        System.out.println("Emplyoyee name : "+empName);
        System.out.println("Emplyoyee city : "+city);
        department.getDepartmentDetails();


    }
}
