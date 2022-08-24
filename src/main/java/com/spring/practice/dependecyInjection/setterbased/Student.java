package com.spring.practice.dependecyInjection.setterbased;

public class Student {
    private int rollNo ;
    private String studentName;
    private Marks marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public void getDetails()
    {
        System.out.println("Student roll no : "+rollNo);
        System.out.println("Student Name: "+studentName);
         marks.getMarksDetails();
        System.out.println("Student totalMarks : "+marks.getTotalMarks());

    }
}
