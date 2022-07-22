package com.company.repository;

import com.company.module.Group;
import com.company.util.Parser;

import java.util.ArrayList;
import java.util.List;

public class GroupRepository {
    private List<Group> groups = new ArrayList<>();

    public GroupRepository(){
//        this.groups = Parser
    }

    public void addGroups(List<Group> addGroups){
        groups.addAll(addGroups);
    }
    public void removeGroups(List<Group> removeGroups) {
        groups.removeAll(removeGroups);
    }

        public List<Group> getGroups(){
            return groups;
        }
}
