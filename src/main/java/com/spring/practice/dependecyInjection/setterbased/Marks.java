package com.spring.practice.dependecyInjection.setterbased;

public class Marks {
    private int engMarks;
    private int mathMarks;

    public void setEngMarks(int engMarks) {
        this.engMarks = engMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void getMarksDetails()
    {
        System.out.println("English Marks: "+engMarks);
        System.out.println("Math Marks: "+mathMarks);
    }

    public int getTotalMarks()
    {
        return engMarks+mathMarks;
    }
}
