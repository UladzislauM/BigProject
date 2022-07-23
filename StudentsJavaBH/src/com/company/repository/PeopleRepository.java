package com.company.repository;

import com.company.base.People;
import com.company.service.MethodistService;
import com.company.service.StudentService;
import com.company.service.TeacherService;
import com.company.util.NamesSortedComparator;
import com.company.util.Parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PeopleRepository {
    private List<People> peoples = new ArrayList<>();
    private StudentService studentService;
    private TeacherService teacherService;
    private MethodistService methodistService;

    //Создаем конструктор для создания и заполнения всего персонала
    public PeopleRepository(){
        teacherService.getTeachers().stream()
                        .forEach(t -> this.peoples.add(t));
        methodistService.getMethodists().stream()
                        .forEach(m -> this.peoples.add(m));
        studentService.getStudents().stream()
                        .forEach(s -> this.peoples.add(s));
    }
    //Методы добавления, удаления и получения данных к персоналу
    public void addPeople(People addPeople){
        peoples.add(addPeople);
    }
    public void removePeoples(People removePeople){
        peoples.remove(removePeople);
    }

    public List<People> getPeoples() {
        return peoples;
    }

    //Метод сортировки всего персонала по алфавиту
    public List<People> peopleSortedABS(){
        List<People> finalPeople = new ArrayList<>();
        peoples.stream()
                .sorted((x1, x2) -> x1.getName().compareTo(x2.getName()))
                .forEach(p -> finalPeople.add(p));
        return finalPeople;
    }
    //Метод сортировки персонала компаратором в обратном порядке по алфавиту
    public List<People> peopleSortedComparatorReverse(){
        NamesSortedComparator namesSortedComparator = new NamesSortedComparator();
        List<People> peopleList = new ArrayList<>();

        peoples.stream()
                .sorted(namesSortedComparator)
                .forEach(p -> peopleList.add(p));
        return peopleList;
    }
    //Метод сортировки персонала Comparable в обратном порядке
    // по фамилии, по алфавиту
    public List<People> peopleSortedComparableReverseByLastName(){
        List<People> peopleList = new ArrayList<>();

        peoples.stream()
                .sorted()
                .forEach(p -> peopleList.add(p));
        return peopleList;
    }
    //Метод записи в файл по произвольному пути
    public void writePeople(String path) throws IOException {
        //создаю переменную для записи в файл коллекции
        // (скачала из коллекции в строку, потом в файл)
        String writeData = " ";

        peoples.stream()
                .forEach(p -> writeData.concat(p.toString()));

        Parser.writeFile(path, writeData);
    }
}
