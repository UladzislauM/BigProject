package com.company.repository;

import com.company.module.Group;
import com.company.util.Parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GroupRepository {
    private List<Group> groups = new ArrayList<>();

    public GroupRepository() throws IOException {
        this.groups = Parser.parsGroups("groupsFile.txt");
    }

    public void addGroup(Group addGroup){
        groups.add(addGroup);
    }
    public void removeGroup(Group removeGroup) {
        groups.remove(removeGroup);
    }

        public List<Group> getGroups(){
            return groups;
        }
}
