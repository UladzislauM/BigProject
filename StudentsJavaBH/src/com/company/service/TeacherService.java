package com.company.service;

import com.company.module.Student;
import com.company.module.Teacher;
import com.company.repository.TeacherRepository;

import java.util.List;

public class TeacherService {
    TeacherRepository teacherRepository;
    //Создаем конструктор и получаем данные из репозитория
    public TeacherService(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    //Методы получения, добавления и удаления учителей
    //________________________________________________
    public List<Teacher> getTeachers() {
        System.out.println("Start method getTeacher");
        List<Teacher> teachersList = teacherRepository.getTeachers();
        System.out.println(teachersList);
        return teachersList;
    }
    public void addTeacher (Teacher addTeacher){
        System.out.println("Start method addTeacher");
        teacherRepository.addTeacher(addTeacher);
        System.out.println(teacherRepository.getTeachers());
    }
    public void removeTeacher(Teacher removeTeacher){
        System.out.println("Start method removeTeacher");
        teacherRepository.removeTeacher(removeTeacher);
        System.out.println(teacherRepository.getTeachers());
    }
    //________________________________________________

    //Метод фильтрации учителей на пенсии с выводом на экран
    public void teachersOnRetiredFilter(List<Teacher> teachers){
        System.out.println("Start method teachersOnRetiredFilter");
        teacherRepository.teachersOnRetiredFilter(teachers);
        teachers.stream()
                .forEach(System.out::println);
    }
}
