package com.company.service;

import com.company.module.Methodist;
import com.company.module.Teacher;
import com.company.repository.MethodistRepository;

import java.util.List;

public class MethodistService {
    private MethodistRepository methodistRepository;
    //Создаем конструктор и получаем данные из репозитория
    public MethodistService(MethodistRepository methodistRepository){
        this.methodistRepository = methodistRepository;
    }
    //Методы получения, добавления и удаления методистов
    //________________________________________________
    public List<Methodist> getMethodists() {
        System.out.println("Start method getMethodists");
        List<Methodist> methodists = methodistRepository.getMethodists();
        System.out.println(methodists);
        return methodists;
    }
    public void addMethodist (Methodist addMethodist){
        System.out.println("Start method addMethodist");
        methodistRepository.addMethodist(addMethodist);
        System.out.println(methodistRepository.getMethodists());
    }
    public void removeMethodist(Methodist removeMethodist){
        System.out.println("Start method removeMethodist");
        methodistRepository.removeMethodist(removeMethodist);
        System.out.println(methodistRepository.getMethodists());
    }
    //_________________________________________________

    //Метод конвертации учителя в методиста
    public Methodist convertTeacherMethodistand(Teacher teacher, Methodist methodist) {
        System.out.println("Start method convertTeacherMethodist");
        methodist = methodistRepository.convertTeacherMethodist(teacher);
        methodistRepository.getMethodists().stream().forEach(System.out::println);
        return methodist;
    }
    //добавление подчиненных учителей к методисту
    public void addTheacherToMetodist(int index, Teacher teacher){
        System.out.println("Start method addTeacherToMethodist");
        methodistRepository.addTeachertoMethodist(index, teacher);
        methodistRepository.getMethodists().stream().forEach(System.out::println);
    }

}
