package com.company.tests;

import com.company.module.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeacherTest {
 private Teacher teacher;

    public void setUp() {
       teacher = new Teacher("Djin", "Lampivi",
               105, null, 0, "G");
    }

    @Test
    public void getSalaryTest() {
       Assert.assertTrue(teacher.getSalary() >= 0);
    }

    @Test
    public void payRollCalculationTest() {
       Assert.assertEquals(205*80, teacher.payRollCalculation(205, 80));
    }
    @Test
   public void ageTest(){
       Assert.assertTrue(teacher.getAge() > 0);
    }
}