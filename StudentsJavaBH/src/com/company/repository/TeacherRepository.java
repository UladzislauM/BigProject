package com.company.repository;

import com.company.exceptions.WrongGenderExeption;
import com.company.module.Teacher;
import com.company.util.GenderException;
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
    //Методы добавления, удаления и получения данных из учителей
    public void addTeacher (Teacher addTeacher){
        teachers.add(addTeacher);
    }
    public void removeTeacher (Teacher removeTeacher){
        teachers.remove(removeTeacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    //Фильтр учителей на пенсии
    public List<Teacher> teachersOnRetiredFilter(){
        List<Teacher> finalTeachers = new ArrayList<>();
        teachers.stream()
                .filter(x->x.getGender().equals("retired"))
                .forEach(s -> finalTeachers.add(s));
        return finalTeachers;
    }

    //Фильтр учителей с ЗП выше 2000
    public List<Teacher> teachersAbove2000Filter(){
        List<Teacher> finalTeachers = new ArrayList<>();
        teachers.stream()
                .filter(x->x.getSalary() > 2000)
                .forEach(s -> finalTeachers.add(s));
        return finalTeachers;
    }
    //Проверка на пенсии ли учитель
    public boolean genderTest(String genderTest) throws WrongGenderExeption {
        return GenderException.checkGender(genderTest);
    }
}
