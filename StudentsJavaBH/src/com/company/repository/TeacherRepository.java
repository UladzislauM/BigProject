package com.company.repository;

import com.company.module.Teacher;
import com.company.util.Parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    private List<Teacher> teachers = new ArrayList<>();

    //Создаем конструктор для передачи данных из файла в сервис
    public TeacherRepository() throws IOException {
        this.teachers = Parser.parsTeacher("teachersFile.txt");
    }

    public void addTeacher (Teacher addTeacher){
        teachers.add(addTeacher);
    }
    public void removeTeacher (Teacher removeTeacher){
        teachers.remove(removeTeacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
