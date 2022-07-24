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
        System.out.println("Start method getMethodists\n-------------------");
        List<Methodist> methodists = methodistRepository.getMethodists();
        methodists.stream()
                .forEach(System.out::println);
        return methodists;
    }
    public void addMethodist (Methodist addMethodist){
        System.out.println("Start method addMethodist\n-------------------");
        methodistRepository.addMethodist(addMethodist);
        methodistRepository.getMethodists().stream().forEach(System.out::println);
    }
    public void removeMethodist(Methodist removeMethodist){
        System.out.println("Start method removeMethodist\n-------------------");
        methodistRepository.removeMethodist(removeMethodist);
        methodistRepository.getMethodists().stream().forEach(System.out::println);
    }
    //_________________________________________________

    //Метод конвертации учителя в методиста
    public void convertTeacherMethodistand(Teacher teacher) {
        System.out.println("Start method convertTeacherMethodist\n-------------------");
        methodistRepository.addMethodist(methodistRepository.convertTeacherMethodist(teacher));
        methodistRepository.getMethodists().stream().forEach(System.out::println);
    }
    //добавление подчиненных учителей к методисту
    public void addTheacherToMetodist(int index, Teacher teacher){
        System.out.println("Start method addTeacherToMethodist\n-------------------");
        methodistRepository.addTeachertoMethodist(index, teacher);
//        methodistRepository.getMethodists().stream().forEach(System.out::println);
    }
    //Вывод на экран (в консоль)
    public void printToC(){
        System.out.println("Start method printToC\n-------------------");
        methodistRepository.getMethodists().stream()
                .forEach(System.out::println);
    }
}
