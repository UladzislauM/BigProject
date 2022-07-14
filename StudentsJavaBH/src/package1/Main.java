package package1;

import util.Converter;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		Teacher th1 = new Teacher("Tatyana",
				"Mex", 21, null, 1500);
		
		Group group = new Group("11A", 11, th1);
		
		Student st1 = new Student("Vas",
				"Blinsk",28, null);
		Student st2 = new Student("Jek",
				"Blinsk",27, null);
		Student st3 = new Student("Vlad",
				"Mir",29, null);


		Teacher th2 = new Teacher("Eyheniya",
				"Genzus", 28, null, 1800);

//		System.out.println("Before: " + group.toString());

		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);

//		System.out.println("After: " + group.toString());
//
//		System.out.println(group.getStudent());

		Converter<Teacher, Methodist> converter = x ->
				new Methodist(x.getName(), x.getLastName(), x.getAge(), null, null);

		Methodist methodist = converter.convert(th1);

		methodist.addTeacher(th2);

		System.out.println(methodist.toString());

	}

}
