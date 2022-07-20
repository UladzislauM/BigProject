package com.company.service;

import com.company.module.Group;
import com.company.module.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroupTest {

    private Group group;

    @Before
    public void setUp(){
        group = new Group("11a", 1, 2019, 2023);

        group.addStudent(new Student());

    }

    @Test
    public void addStudentTest(){
        Assert.assertTrue(group.getStudent().size() != 0);
    }

    @Test
    public void dellStudentTest(){
        group.dellStudent(group.getStudent().get(group.getStudent().size()-1));
        Assert.assertTrue(group.getStudent().size() == 0);
    }
}
