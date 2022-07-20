package com.company;

import com.company.base.People;
import com.company.module.Group;
import com.company.module.Methodist;
import com.company.module.Student;
import com.company.module.Teacher;
import com.company.util.Converter;
import com.company.util.NamesSortedComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		
		Group group = new Group("11A", 11, 2018, 2022);
		Group group2 = new Group("10", 10, 2019, 2023);
		Group group3 = new Group("9", 9, 2020, 2024);

		Student st1 = new Student("Vas",
				"Blinsk",28, null, "Student");
		Student st2 = new Student("Jek",
				"Blinsk",27, null, "Student");
		Student st3 = new Student("Vlad",
				"Mir",29, null, "Student");
		Student st4 = new Student("Vlad",
				"Usachev",22, null, "Student");
		Student st5 = new Student("Yauheni",
				"Zablotski",24, null, "Student");
		Student st6 = new Student("Alex",
				"Puchin",26, null, "Student");
		Student st7 = new Student("Dmitry",
				"Pushnoy",28, null, "Student");
		Student st8 = new Student("Roman",
				"Shatsov",25, null, "Student");
		Student st9 = new Student("Vitaly",
				"Shatsov",24, null, "Student");

		Teacher th1 = new Teacher("Tatyana","Mex",
				62,null, 1500, "retired");
		Teacher th2 = new Teacher("Eyheniya","Genzus",
				28, null, 1800, "young specialist");
		Teacher th3 = new Teacher("Haliana","Sidoric",
				29, null, 5400, "female specialist");
		Teacher th4 = new Teacher("Yauheni",  "Lastovich",
				28, null, 2500, "male specialist");
		Teacher th5 = new Teacher("Andrey",  "Acsenov",
				32, null, 3800, "male specialist");
		Teacher th6 = new Teacher("Semen",  "Acsenov",
				66, null, 2100, "retired");

//		System.out.println("Before: " + group.toString());

		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group2.addStudent(st4);
		group2.addStudent(st5);
		group2.addStudent(st6);
		group3.addStudent(st7);
		group3.addStudent(st8);
		group3.addStudent(st9);

		group.addTeacher(th1);
		group.addTeacher(th2);
		group.addTeacher(th3);
		group.addTeacher(th4);
		group.addTeacher(th5);
		group.addTeacher(th6);

		System.out.println("\nTeachers before convert: " +
				"\n-------------------------------------------------");

		group.getTeacher().stream()
				.forEach(System.out::println);

		Converter<Teacher, Methodist> converter = x ->
				new Methodist(x.getName(), x.getLastName(), x.getAge(),
						null, x.getSalary(), x.getGender() + " (Methodist)", null);

		Methodist methodist = converter.convert(th1);
		Methodist methodist2 = converter.convert(th2);

		methodist.addTeacher(th3);
		methodist.addTeacher(th4);
		methodist2.addTeacher(th5);

		List<Methodist> methodists = new ArrayList<Methodist>(){{
			add(methodist);
			add(methodist2);
		}};

		group.dellTeacher(th1);
		group.dellTeacher(th2);

		System.out.println("\nTeachers after convert: ");

		System.out.println("\nMethodists: " +
				"\n-------------------------------------------------");

		methodists.stream()
						.forEach(System.out::println);

		System.out.println("\nTeachers: " +
				"\n-------------------------------------------------");

		group.getTeacher().stream()
				.forEach(System.out::println);

		System.out.println("\nTeachers on retired: " +
				"\n-------------------------------------------------");

		group.getTeacher().stream()
				.filter(x->x.getGender().equals("retired"))
				.forEach(System.out::println);

		System.out.println("\nTeachers' salaries are above 2000: " +
				"\n-------------------------------------------------");

		group.getTeacher().stream()
				.filter(x->x.getSalary() > 2000)
				.forEach(System.out::println);

		List<Group> groups = new ArrayList<Group>(){{
			add(group);
			add(group2);
			add(group3);
		}};

		System.out.println("\nAll Groups: " +
				"\n-------------------------------------------------");

		groups.stream()
						.forEach(System.out::println);

		System.out.println("\nGroups out 2022-2023: " +
				"\n-------------------------------------------------");

		groups.stream()
				.filter(x1 -> x1.getOutYear() >= 2022)
				.filter(x2 -> x2.getOutYear() <= 2023)
				.forEach(System.out::println);

		List<People> peopleList = new ArrayList<People>();

		groups.stream()
				.forEach(x -> peopleList.addAll(x.getTeacher()));
		groups.stream()
				.forEach(x -> peopleList.addAll(x.getStudent()));

		methodists.stream()
						.forEach(x -> peopleList.add(x));

		System.out.println("\nAll Personal before sorted: " +
				"\n-------------------------------------------------");

		peopleList.stream()
				.forEach(System.out::println);

		System.out.println("\nAll Personal after sorted: " +
				"\n-------------------------------------------------");

		peopleList.stream()
				.sorted((x1, x2) -> x1.getName().compareTo(x2.getName()))
				.forEach(System.out::println);

		System.out.println("\nAll Personal after sorted Comparator (reverse): " +
				"\n-------------------------------------------------");

		NamesSortedComparator namesSortedComparator = new NamesSortedComparator();

		peopleList.stream()
				.sorted(namesSortedComparator)
				.forEach(System.out::println);

		System.out.println("\nAll Personal after sorted Comparable (reverse) by Last Name: " +
		"\n-------------------------------------------------");

        peopleList.stream()
				.sorted()
				.forEach(System.out::println);
	}

}
