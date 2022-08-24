package com.spring.practice.dependecyInjection.constructorBased;

public class Mark {

    private int historyMarks;
    private int geoMarks;
    private int civisMarks;

    public Mark(int historyMarks, int geoMarks, int civisMarks) {
        this.historyMarks = historyMarks;
        this.geoMarks = geoMarks;
        this.civisMarks = civisMarks;
    }

    public int totalMarks()
    {
        return historyMarks+geoMarks+civisMarks;
    }

    public void marksDetails()
    {
        System.out.println(" History marks : "+historyMarks);
        System.out.println(" Geograpghy marks : "+geoMarks);
        System.out.println(" Civics marks : "+civisMarks);
    }
}
