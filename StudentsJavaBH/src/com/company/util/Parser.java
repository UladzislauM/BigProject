package com.company.util;

import com.company.module.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public static String readFile(String puth) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        String str = " ";
        try {
            fileReader = new FileReader(puth);
            fileWriter = new FileWriter(puth);

            int a;
            while ((a = fileReader.read()) != -1) {
//                fileWriter.write(a);
                str += (char) a;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
        return str;
    }
    //Методы для добавления в конструктор репозитория разных коллекций
    //_________________________________________________________________________
    public static List<Student> parsStudent(String puthStudent) throws IOException {
       String str = readFile(puthStudent);
        return readStudent(str);
    }
    public static List<Teacher> parsTeacher(String puthTeacher) throws IOException {
        String str = readFile(puthTeacher);
        return readTeacher(str);
    }
    public static List<Methodist> parsMethodist(String puthMethodist) throws IOException {
        String str = readFile(puthMethodist);
        return readMethodist(str);
    }
    public static List<Group> parsGroups(String puthGroup) throws IOException {
        String str = readFile(puthGroup);
        return readGroups(str);
    }

    //__________________________________________________________________________

    //Методы для обработки текста из файлов
    private static List<Student> readStudent(String str){
        //Создаем необходимые коллекции для хранения данных
        List<String> stringList;
        List<Student> studentList = new ArrayList<>();
        Address address;

        //Делим данные файла на строки
        List<String> stringSplit = Arrays.asList(str.split("\n"));

        //В цикле каждая итерация - новая строка файла -
        // - делим ее на слова (по пробелам) - записываем в студента нужные строки
        for (String x : stringSplit) {
            stringList = new ArrayList<>(Arrays.asList(x.trim().split(" ")));

            address = new Address(stringList.get(3), stringList.get(4),
                    Integer.parseInt(stringList.get(5)), Integer.parseInt(stringList.get(6)));

            studentList.add(new Student(stringList.get(0), stringList.get(1),
                    Integer.parseInt(stringList.get(2)), address, stringList.get(8)));
        }
        //Возвращаем коллекцию студентов
        return studentList;
    }

    private static List<Teacher> readTeacher(String str){
        //Создаем необходимые коллекции для хранения данных
        List<String> stringList;
        List<Teacher> teachersList = new ArrayList<>();
        Address address;

        //Делим данные файла на строки
        List<String> stringSplit = Arrays.asList(str.split("\n"));

        //В цикле каждая итерация - новая строка файла -
        // - делим ее на слова (по пробелам) - записываем в учителя нужные строки
        for (String x : stringSplit) {
            stringList = new ArrayList<>(Arrays.asList(x.trim().split(" ")));

            address = new Address(stringList.get(3), stringList.get(4),
                    Integer.parseInt(stringList.get(5)), Integer.parseInt(stringList.get(6)));

            teachersList.add(new Teacher(stringList.get(0), stringList.get(1),
                    Integer.parseInt(stringList.get(2)), address, Integer.parseInt(stringList.get(7)),
                    stringList.get(8)));
        }
        //Возвращаем коллекцию учителей
        return teachersList;
    }
    private static List<Methodist> readMethodist(String str){
        //Создаем необходимые коллекции для хранения данных
        List<String> stringList;
        List<Methodist> methodistList = new ArrayList<>();
        Address address;

        //Делим данные файла на строки
        List<String> stringSplit = Arrays.asList(str.split("\n"));

        //В цикле каждая итерация - новая строка файла -
        // - делим ее на слова (по пробелам) - записываем в учителя нужные строки
        for (String x : stringSplit) {
            stringList = new ArrayList<>(Arrays.asList(x.trim().split(" ")));

            address = new Address(stringList.get(3), stringList.get(4),
                    Integer.parseInt(stringList.get(5)), Integer.parseInt(stringList.get(6)));

            methodistList.add(new Methodist(stringList.get(0), stringList.get(1),
                    Integer.parseInt(stringList.get(2)), address, Integer.parseInt(stringList.get(7)),
                    stringList.get(8)));
        }
        //Возвращаем коллекцию методистов
        return methodistList;
    }
    private static List<Group> readGroups(String str){
        //Создаем необходимые коллекции для хранения данных
        List<String> stringList;
        List<Group> groupsList = new ArrayList<>();
        Address address;

        //Делим данные файла на строки
        List<String> stringSplit = Arrays.asList(str.split("\n"));

        //В цикле каждая итерация - новая строка файла -
        // - делим ее на слова (по пробелам) - записываем в группу нужные строки
        for (String x : stringSplit) {
            stringList = new ArrayList<>(Arrays.asList(x.trim().split(" ")));

            address = new Address(stringList.get(3), stringList.get(4),
                    Integer.parseInt(stringList.get(5)), Integer.parseInt(stringList.get(6)));

            groupsList.add(new Group(stringList.get(0), Integer.parseInt(stringList.get(1)),
                    Integer.parseInt(stringList.get(2)), Integer.parseInt(stringList.get(3)),
                    null, null));
        }
        //Возвращаем коллекцию методистов
        return groupsList;
    }
}


