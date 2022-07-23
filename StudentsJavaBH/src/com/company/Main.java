package com.company;

import com.company.base.People;
import com.company.module.Group;
import com.company.module.Methodist;
import com.company.module.Student;
import com.company.module.Teacher;
import com.company.repository.Repository;
import com.company.util.Converter;
import com.company.util.NamesSortedComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//
//		Repository repository = new Repository();
//
//		repository.addGroup(new Group("11A", 11,
//				2018, 2022, null, null));
//		repository.addGroup(new Group("10", 10,
//				2019, 2023, null, null));
//		repository.addGroup(new Group("9", 9,
//				2020, 2024, null, null));
//
//		Student st1 = new Student("Vas",
//				"Blinsk",28, null, "Student");
//		Student st2 = new Student("Jek",
//				"Blinsk",27, null, "Student");
//		Student st3 = new Student("Vlad",
//				"Mir",29, null, "Student");
//		Student st4 = new Student("Vlad",
//				"Usachev",22, null, "Student");
//		Student st5 = new Student("Yauheni",
//				"Zablotski",24, null, "Student");
//		Student st6 = new Student("Alex",
//				"Puchin",26, null, "Student");
//		Student st7 = new Student("Dmitry",
//				"Pushnoy",28, null, "Student");
//		Student st8 = new Student("Roman",
//				"Shatsov",25, null, "Student");
//		Student st9 = new Student("Vitaly",
//				"Shatsov",24, null, "Student");
//
//		Teacher th1 = new Teacher("Tatyana","Mex",
//				62,null, 1500, "retired");
//		Teacher th2 = new Teacher("Eyheniya","Genzus",
//				28, null, 1800, "young specialist");
//		Teacher th3 = new Teacher("Haliana","Sidoric",
//				29, null, 5400, "female specialist");
//		Teacher th4 = new Teacher("Yauheni",  "Lastovich",
//				28, null, 2500, "male specialist");
//		Teacher th5 = new Teacher("Andrey",  "Acsenov",
//				32, null, 3800, "male specialist");
//		Teacher th6 = new Teacher("Semen",  "Acsenov",
//				66, null, 2100, "retired");
//
////		System.out.println("Before: " + group.toString());
//
//		repository.addStudent(1, st1);
//		repository.addStudent(1, st2);
//		repository.addStudent(1, st3);
//		repository.addStudent(2, st4);
//		repository.addStudent(2, st5);
//		repository.addStudent(2, st6);
//		repository.addStudent(3, st7);
//		repository.addStudent(3, st8);
//		repository.addStudent(3, st9);
//
//		repository.addTeacher(th1);
//		repository.addTeacher(th2);
//		repository.addTeacher(th3);
//		repository.addTeacher(th4);
//		repository.addTeacher(th5);
//		repository.addTeacher(th6);

		System.out.println("\nTeachers before convert: " +
				"\n-------------------------------------------------");
//
//		repository.getTeachers().stream()
//				.forEach(System.out::println);

//		Methodist methodist = repository.convertTeacherMethodist(th1);
//		Methodist methodist2 = repository.convertTeacherMethodist(th2);
//
//		methodist.addTeacher(th3);
//		methodist.addTeacher(th4);
//		methodist2.addTeacher(th5);
//
////		List<Methodist> methodists = new ArrayList<Methodist>(){{
////			add(methodist);
////			add(methodist2);
////		}};
//
//		repository.addMethodist(methodist);
//		repository.addMethodist(methodist2);
//
//		repository.removeTeacher(th1);
//		repository.removeTeacher(th2);

		System.out.println("\nTeachers after convert: ");

		System.out.println("\nMethodists: " +
				"\n-------------------------------------------------");

//		repository.getMethodists().stream()
//						.forEach(System.out::println);
//
//		System.out.println("\nTeachers: " +
//				"\n-------------------------------------------------");
//
//		repository.getTeachers().stream()
//				.forEach(System.out::println);

		System.out.println("\nTeachers on retired: " +
				"\n-------------------------------------------------");

//		repository.getTeachers().stream()
//				.filter(x->x.getGender().equals("retired"))
//				.forEach(System.out::println);

		System.out.println("\nTeachers' salaries are above 2000: " +
				"\n-------------------------------------------------");

		repository.getTeachers().stream()
				.filter(x->x.getSalary() > 2000)
				.forEach(System.out::println);

//		List<Group> groups = new ArrayList<Group>(){{
//			add(group);
//			add(group2);
//			add(group3);
//		}};

		System.out.println("\nAll Groups: " +
				"\n-------------------------------------------------");

		repository.getGroups().stream()
						.forEach(System.out::println);

		System.out.println("\nGroups out 2022-2023: " +
				"\n-------------------------------------------------");

		repository.getGroups().stream()
				.filter(x1 -> x1.getOutYear() >= 2022)
				.filter(x2 -> x2.getOutYear() <= 2023)
				.forEach(System.out::println);

//		List<People> peopleList = new ArrayList<People>();

		repository.getGroups().stream()
				.forEach(x -> repository.addPeopleLists(x.getTeacher()));
		repository.getGroups().stream()
				.forEach(x -> repository.addPeopleLists(x.getStudent()));

		repository.getMethodists().stream()
						.forEach(x -> repository.addPeopleList(x));

		System.out.println("\nAll Personal before sorted: " +
				"\n-------------------------------------------------");

		repository.getPeopleList().stream()
				.forEach(System.out::println);

		System.out.println("\nAll Personal after sorted: " +
				"\n-------------------------------------------------");

		repository.getPeopleList().stream()
				.sorted((x1, x2) -> x1.getName().compareTo(x2.getName()))
				.forEach(System.out::println);

		System.out.println("\nAll Personal after sorted Comparator (reverse): " +
				"\n-------------------------------------------------");

		NamesSortedComparator namesSortedComparator = new NamesSortedComparator();

		repository.getPeopleList().stream()
				.sorted(namesSortedComparator)
				.forEach(System.out::println);

		System.out.println("\nAll Personal after sorted Comparable (reverse) by Last Name: " +
		"\n-------------------------------------------------");

		repository.getPeopleList().stream()
				.sorted()
				.forEach(System.out::println);
	}

}


