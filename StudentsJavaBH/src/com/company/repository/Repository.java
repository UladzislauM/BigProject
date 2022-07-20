package com.company.repository;

import com.company.module.Group;
import java.util.ArrayList;
import java.util.List;

public abstract class Repository {
    private List<Group> groups = new ArrayList<>();

    public void addGroups(List<Group> addGroup){
        groups.addAll(addGroup);
    }
    public void removeGroups(List<Group> removeGroup){
        groups.removeAll(removeGroup);
    }

    public List<Group> getGroups(){
        return groups;
    }
}
