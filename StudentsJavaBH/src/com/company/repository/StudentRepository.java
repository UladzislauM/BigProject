package com.company.repository;

import com.company.module.Student;
import com.company.util.Parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students;

    //Создаем конструктор для передачи данных из файла в сервис
    public StudentRepository() throws IOException {
        this.students = Parser.parsStudent("studentsFile.txt");
    }

    //Методы добавления, удаления, записи в файл и получения данных к Студентам
    public void addStudent(Student addStudent){
        students.add(addStudent);
    }
    public void removeStudent(Student removeStudent){
        students.remove(removeStudent);
    }
    public void writeToFite(List<Student> students){

    }

    public List<Student> getStudents() {
        return students;
    }


}
