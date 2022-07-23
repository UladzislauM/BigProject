package com.company.service;

import com.company.module.Group;
import com.company.module.Methodist;
import com.company.repository.GroupRepository;
import com.company.repository.TeacherRepository;

import java.util.List;

public class GroupService {
    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }

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
}
