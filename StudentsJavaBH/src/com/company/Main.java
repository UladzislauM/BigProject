package com.company;

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

	public static void main(String[] args) throws IOException {
		StudentService studentService = new StudentService(new StudentRepository());
		studentService.getStudents();

		TeacherService teacherService = new TeacherService(new TeacherRepository());
		teacherService.getTeachers();

		MethodistService methodistService =new MethodistService(new MethodistRepository());
		methodistService.getMethodists();

		GroupService groupService = new GroupService(new GroupRepository());
		groupService.getGroups();

		PeopleService peopleService = new PeopleService();
		peopleService.getPeoples();


//
////		repository.addStudent(1, st1);
////		repository.addStudent(1, st2);
////		repository.addStudent(1, st3);
////		repository.addStudent(2, st4);
////		repository.addStudent(2, st5);
////		repository.addStudent(2, st6);
////		repository.addStudent(3, st7);
////		repository.addStudent(3, st8);
////		repository.addStudent(3, st9);
////
////		repository.addTeacher(th1);
////		repository.addTeacher(th2);
////		repository.addTeacher(th3);
////		repository.addTeacher(th4);
////		repository.addTeacher(th5);
////		repository.addTeacher(th6);
//
//		System.out.println("\nTeachers before convert: " +
//				"\n-------------------------------------------------");
////
////		repository.getTeachers().stream()
////				.forEach(System.out::println);
//
////		Methodist methodist = repository.convertTeacherMethodist(th1);
////		Methodist methodist2 = repository.convertTeacherMethodist(th2);
////
////		methodist.addTeacher(th3);
////		methodist.addTeacher(th4);
////		methodist2.addTeacher(th5);
////
//////		List<Methodist> methodists = new ArrayList<Methodist>(){{
//////			add(methodist);
//////			add(methodist2);
//////		}};
////
////		repository.addMethodist(methodist);
////		repository.addMethodist(methodist2);
////
////		repository.removeTeacher(th1);
////		repository.removeTeacher(th2);
//
//		System.out.println("\nTeachers after convert: ");
//
//		System.out.println("\nMethodists: " +
//				"\n-------------------------------------------------");
//
////		repository.getMethodists().stream()
////						.forEach(System.out::println);
////
////		System.out.println("\nTeachers: " +
////				"\n-------------------------------------------------");
////
////		repository.getTeachers().stream()
////				.forEach(System.out::println);
//
//		System.out.println("\nTeachers on retired: " +
//				"\n-------------------------------------------------");
//
////		repository.getTeachers().stream()
////				.filter(x->x.getGender().equals("retired"))
////				.forEach(System.out::println);
//
//		System.out.println("\nTeachers' salaries are above 2000: " +
//				"\n-------------------------------------------------");
//
////		repository.getTeachers().stream()
////				.filter(x->x.getSalary() > 2000)
////				.forEach(System.out::println);
//
////		List<Group> groups = new ArrayList<Group>(){{
////			add(group);
////			add(group2);
////			add(group3);
////		}};
//
//		System.out.println("\nAll Groups: " +
//				"\n-------------------------------------------------");
//
////		repository.getGroups().stream()
////						.forEach(System.out::println);
//
//		System.out.println("\nGroups out 2022-2023: " +
//				"\n-------------------------------------------------");
//
////		repository.getGroups().stream()
////				.filter(x1 -> x1.getOutYear() >= 2022)
////				.filter(x2 -> x2.getOutYear() <= 2023)
////				.forEach(System.out::println);
//
////		List<People> peopleList = new ArrayList<People>();
//
////		repository.getGroups().stream()
////				.forEach(x -> repository.addPeopleLists(x.getTeacher()));
////		repository.getGroups().stream()
////				.forEach(x -> repository.addPeopleLists(x.getStudent()));
////
////		repository.getMethodists().stream()
////						.forEach(x -> repository.addPeopleList(x));
//
//		System.out.println("\nAll Personal before sorted: " +
//				"\n-------------------------------------------------");
////
////		repository.getPeopleList().stream()
////				.forEach(System.out::println);
//
//		System.out.println("\nAll Personal after sorted: " +
//				"\n-------------------------------------------------");
//
////		repository.getPeopleList().stream()
////				.sorted((x1, x2) -> x1.getName().compareTo(x2.getName()))
////				.forEach(System.out::println);
//
//		System.out.println("\nAll Personal after sorted Comparator (reverse): " +
//				"\n-------------------------------------------------");
//
////		NamesSortedComparator namesSortedComparator = new NamesSortedComparator();
////
////		repository.getPeopleList().stream()
////				.sorted(namesSortedComparator)
////				.forEach(System.out::println);
//
//		System.out.println("\nAll Personal after sorted Comparable (reverse) by Last Name: " +
//		"\n-------------------------------------------------");
//
////		repository.getPeopleList().stream()
////				.sorted()
////				.forEach(System.out::println);
	}

}


