package com.company.service;

import com.company.module.Student;
import com.company.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        System.out.println("Start method getStudent");
        List<Student> studentList = studentRepository.getStudents();
        System.out.println(studentList);
        return studentList;
    }
}
