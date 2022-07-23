package com.company.repository;

import com.company.module.Student;
import com.company.util.Parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    //Создаем конструктор для передачи данных из файла в сервис
    public StudentRepository() throws IOException {
        this.students = Parser.parsStudent("studentsFile.txt");
    }

    public void addStudent(Student addStudent){
        students.add(addStudent);
    }
    public void removeStudent(Student removeStudent){
        students.remove(removeStudent);
    }

    public List<Student> getStudents() {
        return students;
    }
}
