package com.company.service;

import com.company.module.Student;
import com.company.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private StudentRepository studentRepository;

    //Создаем конструктор и получаем данные из репозитория
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    //Методы получения, добавления и удаления студентов
    //________________________________________________
    public List<Student> getStudents() {
        System.out.println("Start method getStudent\n-------------------");
        List<Student> studentList = studentRepository.getStudents();
        studentList.stream()
                .forEach(System.out::println);
        return studentList;
    }
    public void addStudent (Student AddStudent){
        System.out.println("Start method addStudent\n-------------------");
        studentRepository.addStudent(AddStudent);
        studentRepository.getStudents().stream()
                .forEach(System.out::println);
    }
    public void removeStudent(Student removeStudent){
        System.out.println("Start method removeStudent\n-------------------");
        studentRepository.removeStudent(removeStudent);
        studentRepository.getStudents().stream()
                .forEach(System.out::println);
    }
    //_____________________________________________________

}
