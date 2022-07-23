package com.company.service;

import com.company.base.People;
import com.company.repository.PeopleRepository;

import java.io.IOException;
import java.util.List;

public class PeopleService {
    private PeopleRepository peopleRepository;

    //Создаем конструктор и получаем данные из репозитория
    public PeopleService() throws IOException {
        this.peopleRepository = new PeopleRepository();
    }

    //Методы получения, добавления и удаления персонала
    //________________________________________________
    public List<People> getPeoples(){
        System.out.println("Start method getPeoples\n-------------------");
        List<People> peopleList = peopleRepository.getPeoples();
        peopleList.stream()
                .forEach(System.out::println);
        return peopleList;
    }
    public void addPeople(People addPeople){
        System.out.println("Start method addPeople\n-------------------");
        peopleRepository.addPeople(addPeople);
        peopleRepository.getPeoples().stream()
                .forEach(System.out::println);
    }
    public void removePeople(People removePeople){
        System.out.println("Start method removePeople\n-------------------");
        peopleRepository.removePeoples(removePeople);
        peopleRepository.getPeoples().stream()
                .forEach(System.out::println);
    }
    //_________________________________________________

    //Метод сортировки всего персонала по алфавиту и вывод на экран
    public void peopleSortedABS(){
        System.out.println("Start method peopleSortedABS\n-------------------");
        peopleRepository.peopleSortedABS().stream()
                .forEach(System.out::println);
    }
    //Метод сортировки персонала компаратором в обратном порядке по алфавиту
    // и вывод на экран
    public void peopleSortedComparatorReverse(){
        System.out.println("Start method peopleSortedComparatorReverse\n-------------------");
        peopleRepository.peopleSortedABS().stream()
                .forEach(System.out::println);
    }
    //Метод сортировки персонала Comparable в обратном порядке
    // по фамилии, по алфавиту и вывод на экран
    public void peopleSortedComparableReverseByLastName(){
        System.out.println("Start method peopleSortedComparableReverseByLastName\n-------------------");
        peopleRepository.peopleSortedComparableReverseByLastName().stream()
                .forEach(System.out::println);
    }

    //Метод записи в файл по произвольному пути
    public void writePeople(String path) throws IOException {
        peopleRepository.writePeople(path);
    }
}
