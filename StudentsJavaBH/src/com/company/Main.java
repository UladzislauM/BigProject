package com.company;

import com.company.exceptions.WrongGenderExeption;
import com.company.module.Teacher;
import com.company.repository.GroupRepository;
import com.company.repository.MethodistRepository;
import com.company.repository.StudentRepository;
import com.company.repository.TeacherRepository;
import com.company.service.*;
import com.company.util.NamesSortedComparator;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, WrongGenderExeption {
        StudentService studentService = new StudentService(new StudentRepository());

        GroupService groupService = new GroupService(new GroupRepository());
        groupService.studentAddToGroup(0, studentService.getStudents().get(0));
        groupService.studentAddToGroup(0, studentService.getStudents().get(1));
        groupService.studentAddToGroup(0, studentService.getStudents().get(2));
        groupService.studentAddToGroup(1, studentService.getStudents().get(3));
        groupService.studentAddToGroup(1, studentService.getStudents().get(4));
        groupService.studentAddToGroup(1, studentService.getStudents().get(5));
        groupService.studentAddToGroup(2, studentService.getStudents().get(6));
        groupService.studentAddToGroup(2, studentService.getStudents().get(7));
        groupService.studentAddToGroup(2, studentService.getStudents().get(8));

        TeacherService teacherService = new TeacherService(new TeacherRepository());

        groupService.teachrAddToGroup(0, teacherService.getTeachers().get(0));
        groupService.teachrAddToGroup(1, teacherService.getTeachers().get(1));
        groupService.teachrAddToGroup(2, teacherService.getTeachers().get(2));

        MethodistService methodistService = new MethodistService(new MethodistRepository());

        PeopleService peopleService = new PeopleService();

        studentService.getStudents();
        teacherService.getTeachers();
        methodistService.getMethodists();
        groupService.getGroups();
        peopleService.getPeoples();


        teacherService.getTeachers();

        methodistService.convertTeacherMethodistand(teacherService.getTeachers().get(3));
        methodistService.convertTeacherMethodistand(teacherService.getTeachers().get(4));

        teacherService.removeTeacher(teacherService.getTeachers().get(3));
        teacherService.removeTeacher(teacherService.getTeachers().get(4));



        System.out.println("\nTeachers and methodists before convert: " +
                "\n-------------------------------------------------");

        teacherService.printToC();
        methodistService.printToC();

        System.out.println("\nTeachers after convert: " +
                "\n++++++++++++++++++++++++++++++++++++++++++++++++++");

		System.out.println("\nMethodists: " +
				"\n-------------------------------------------------");
        methodistService.printToC();

        System.out.println("\nTeachers: " +
				"\n-------------------------------------------------");
        teacherService.printToC();

		System.out.println("\nTeachers on retired: " +
				"\n-------------------------------------------------");
        teacherService.teachersOnRetiredFilter();

		System.out.println("\nTeachers' salaries are above 2000: " +
				"\n-------------------------------------------------");
        teacherService.teachersAbove2000Filter();

		System.out.println("\nAll Groups: " +
				"\n-------------------------------------------------");
        groupService.printToC();

		System.out.println("\nGroups out 2022-2023: " +
				"\n-------------------------------------------------");
        groupService.groupsOutFilter(2022, 2023);

		System.out.println("\nAll Personal before sorted: " +
				"\n-------------------------------------------------");
        peopleService.printToC();

		System.out.println("\nAll Personal after sorted: " +
				"\n-------------------------------------------------");
        peopleService.peopleSortedABS();

		System.out.println("\nAll Personal after sorted Comparator (reverse): " +
				"\n-------------------------------------------------");
        peopleService.peopleSortedComparatorReverse();

		System.out.println("\nAll Personal after sorted Comparable (reverse) by Last Name: " +
		"\n-------------------------------------------------");
        peopleService.peopleSortedComparableReverseByLastName();

        System.out.println("\nChecking whether the teacher has retired (true - not retired): " +
                teacherService.getTeachers().get(1) +
                "\n-------------------------------------------------");
        teacherService.genderTest(teacherService.getTeachers().get(1).getGender());
    }

}


