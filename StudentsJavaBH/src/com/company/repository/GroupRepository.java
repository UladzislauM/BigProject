package com.company.repository;

import com.company.module.Group;
import com.company.util.Parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GroupRepository {
    private List<Group> groups = new ArrayList<>();

    //Создаем конструктор для передачи данных из файла в сервис
    public GroupRepository() throws IOException {
        this.groups = Parser.parsGroups("groupsFile.txt");
    }

    //Методы добавления, удаления и получения данных к Группам
    public void addGroup(Group addGroup) {
        groups.add(addGroup);
    }

    public void removeGroup(Group removeGroup) {
        groups.remove(removeGroup);
    }

    public List<Group> getGroups() {
        return groups;
    }

    //Метод фильтрации групп с выпуском в заданный перриод
    public List<Group> groupsOutFilter(int fromX, int toX) {
        List<Group> finalGroup = new ArrayList<>();
        groups.stream()
                .filter(x1 -> x1.getOutYear() >= fromX)
                .filter(x2 -> x2.getOutYear() <= toX)
                .forEach(s -> finalGroup.add(s));
        return finalGroup;
    }
}
