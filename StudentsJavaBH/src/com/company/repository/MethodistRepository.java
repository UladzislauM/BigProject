package com.company.repository;

import com.company.module.Methodist;
import com.company.module.Teacher;
import com.company.util.Converter;
import com.company.util.Parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MethodistRepository {
    private List<Methodist> methodists;

    //Создаем конструктор для передачи данных из файла в сервис
    public MethodistRepository() throws IOException {
        this.methodists = Parser.parsMethodist("methodistFile.txt");
    }

    //Методы добавления, удаления и получения данных к Методистом
    public void addMethodist(Methodist addMethodist){
        methodists.add(addMethodist);
    }
    public void removeMethodist(Methodist removeMethodist){
        methodists.remove(removeMethodist);
    }

    public List<Methodist> getMethodists() {
        return methodists;
    }

    //Метод - конвертер из учителя в методиста
    public Methodist convertTeacherMethodist(Teacher teacher){
        Converter<Teacher, Methodist> converter = x ->
                new Methodist(x.getName(), x.getLastName(), x.getAge(),
                        null, x.getSalary(), x.getGender()
                        + " (Methodist)", null);
        return converter.convert(teacher);
    }
    //Метод добавления подчиненных учителей к Методисту
    public void addTeachertoMethodist(int indexMethodist, Teacher teacher){
        methodists.get(indexMethodist).addTeacher(teacher);
    }
}
