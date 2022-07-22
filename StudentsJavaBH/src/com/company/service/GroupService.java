package com.company.service;

import com.company.module.Group;
import com.company.repository.GroupRepository;
import com.company.repository.TeacherRepository;

import java.util.List;

public class GroupService {
    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }

    public List<Group> getGroups() {
        System.out.println("Start method getTeacher");
        List<Group> groups = groupRepository.getGroups();
        System.out.println("Groups");
        return groups;
    }
}
