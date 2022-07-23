package com.company.service;

import com.company.module.Student;
import com.company.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        System.out.println("Start method getStudent");
        List<Student> studentList = studentRepository.getStudents();
        System.out.println(studentList);
        return studentList;
    }
    public void addStudent (Student AddStudent){
        System.out.println("Start method addStudent");
        studentRepository.addStudent(AddStudent);
        System.out.println(studentRepository.getStudents());
    }
    public void removeStudent(Student removeStudent){
        System.out.println("Start method removeStudent");
        studentRepository.removeStudent(removeStudent);
        System.out.println(studentRepository.getStudents());
    }

}
