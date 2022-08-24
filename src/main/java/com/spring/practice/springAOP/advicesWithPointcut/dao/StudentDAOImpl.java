package com.spring.practice.springAOP.advicesWithPointcut.dao;

import com.spring.practice.springAOP.advicesWithPointcut.model.Student;
import org.springframework.stereotype.Component;

@Component("studentImplPointcut")
public class StudentDAOImpl implements StudentDAO {
    @Override
    public Student getStudent(int id) {
        Student student = new Student();
        student.setStudentID(id);
        System.out.println("Student ID : "+id);
        return student;
    }
}
