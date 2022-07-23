package com.company.service;

import com.company.module.Group;
import com.company.module.Methodist;
import com.company.repository.GroupRepository;
import com.company.repository.TeacherRepository;

import java.util.List;

public class GroupService {
    private GroupRepository groupRepository;
    //Создаем конструктор и получаем данные из репозитория
    public GroupService(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }
    //Методы получения, добавления и удаления Групп
    //________________________________________________
    public List<Group> getGroups() {
        System.out.println("Start method getGroups");
        List<Group> groups = groupRepository.getGroups();
        System.out.println(groups);
        return groups;
    }
    public void addGroup (Group addGroup){
        System.out.println("Start method addGroup");
        groupRepository.addGroup(addGroup);
        System.out.println(groupRepository.getGroups());
    }
    public void removeGroup(Group removeGroup){
        System.out.println("Start method removeGroup");
        groupRepository.removeGroup(removeGroup);
        System.out.println(groupRepository.getGroups());
    }
    //_____________________________________________________

    //Метод фильтрации групп с заданным выпуском и выводом на экран
    public void groupsOutFilter(int fromX, int toX){
        System.out.println("Start method groupsOutFilter");
        groupRepository.groupsOutFilter(fromX, toX).stream()
                .forEach(System.out::println);
    }
}
