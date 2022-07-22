package com.company.repository;

import com.company.base.People;
import com.company.module.Group;
import com.company.module.Methodist;
import com.company.module.Student;
import com.company.module.Teacher;
import com.company.util.Converter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Methodist> methodists = new ArrayList<>();
//    private  List<Student> students = new ArrayList<>();
    //хранятся в группеб к каждой добавляй студентов
    private List<Teacher> teachers = new ArrayList<>();
    private List<People> peopleList = new ArrayList<People>();




    public void addGroup(Group addGroup){
        groups.add(addGroup);
    }
    public void removeGroup(Group removeGroup){
        groups.remove(removeGroup);
    }
    public void addMethodist(Methodist addMethodist){
        methodists.add(addMethodist);
    }
    public void removeMethodist(Methodist removeMethodist){
        methodists.remove(removeMethodist);
    }
    public void addStudent(int numGroup, Student addStudent){
        groups.get(numGroup).addStudent(addStudent);
    }
    public void removeStudent(int numGroup, Student removeStudent){
        groups.get(numGroup).dellStudent(removeStudent);
    }
    public void addTeacher(Teacher addTeacher){
        teachers.add(addTeacher);
    }


    public void removeTeacher(Teacher removeTeacher){
        teachers.remove(removeTeacher);
    }
    //Перегружаю методы добавления и удаления сущностей в соллекцию базового класса
    public void addPeopleList(Teacher addPeopleList){
        peopleList.add(addPeopleList);
    }
    public void addPeopleList(Student addPeopleList){
        peopleList.add(addPeopleList);
    }
    public void addPeopleList(Methodist addPeopleList){
        peopleList.add(addPeopleList);
    }
    public void removePeopleList(Teacher removePeopleList){
        peopleList.remove(removePeopleList);
    }
    public void removePeopleList(Student removePeopleList){
        peopleList.remove(removePeopleList);
    }
    public void removePeopleList(Methodist removePeopleList){
        peopleList.remove(removePeopleList);
    }
    //Перегружаю методы добавления и удаления коллекций в соллекцию базового класса
    public void addPeopleLists(List addPeopleLists){
        peopleList.addAll(addPeopleLists);
    }
//    public void addPeopleLists(List<Student> addPeopleLists){
//        peopleList.addAll(addPeopleLists);
//    }
//    public void addPeopleLists(List<Methodist> addPeopleLists){
//        peopleList.addAll(addPeopleLists);
//    }
    public void removePeopleLists(List removePeopleLists){
        peopleList.removeAll(removePeopleLists);
    }
//    public void removePeopleLists(List<Student>removePeopleLists){
//        peopleList.removeAll(removePeopleLists);
//    }
//    public void removePeopleLists(List<Methodist>removePeopleLists){
//        peopleList.removeAll(removePeopleLists);
//    }
    //_________________________________________________________________

    //Конвертация и добавление Учителя в Методиста
    public Methodist convertTeacherMethodist(Teacher teacher){
        Converter<Teacher, Methodist> converter = x ->
                new Methodist(x.getName(), x.getLastName(), x.getAge(),
                        null, x.getSalary(), x.getGender()
                        + " (Methodist)", null);
        return converter.convert(teacher);
    }


    public List<Methodist> getMethodists() {
        return methodists;
    }
    public List<Student> getStudents() {
//        return students;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public List<People> getPeopleList() {
        return peopleList;
    }
    public Group getGroup() {
        return group;
    }
}
