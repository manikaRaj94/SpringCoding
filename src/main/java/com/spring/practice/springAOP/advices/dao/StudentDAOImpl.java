package com.spring.practice.springAOP.advices.dao;

import com.spring.practice.springAOP.advices.model.Student;
import org.springframework.stereotype.Component;

@Component("studentImpl")
public class StudentDAOImpl implements StudentDAO{
    @Override
    public Student getStudent(int id) {
        Student student = new Student();
        student.setStudentID(id);
        System.out.println("Student ID : "+id);
        return student;
    }
}
