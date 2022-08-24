package com.spring.practice.dependecyInjection.constructorBased;

public class Student {

    private int studentID;
    private String studentName;
    private Mark marks;

    public Student(int studentID, String studentName, Mark marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }

    public void getStudentdetails()
    {
        System.out.println("Student ID : "+studentID);
        System.out.println("Student name : "+studentID);
        marks.marksDetails();
        System.out.println("Student total marks : "+marks.totalMarks());
    }
}
