package com.company.service;

import com.company.module.Group;
import com.company.repository.Repository;

import java.util.List;

public abstract class Service {

    private Repository repository;

    public Service(Repository repository){
        this.repository = repository;
    }

    public void removeGroups(List<Group> removeGroups){
        System.out.println("Remove groups:");
        removeGroups.forEach(gr -> System.out.println(gr));
        repository.removeGroups(removeGroups);
    }

    public void addGroups(List<Group> newGroups){
        System.out.println("Add groups:");
        newGroups.forEach(gr -> System.out.println(gr));
        repository.addGroups(newGroups);
    }
}
