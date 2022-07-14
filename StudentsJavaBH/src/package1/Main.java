package package1;

import util.Converter;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {


		
		Group group = new Group("11A", 11);
		
		Student st1 = new Student("Vas",
				"Blinsk",28, null, "Student");
		Student st2 = new Student("Jek",
				"Blinsk",27, null, "Student");
		Student st3 = new Student("Vlad",
				"Mir",29, null, "Student");

		Teacher th1 = new Teacher("Tatyana","Mex",
				62,null, 1500, "retired");
		Teacher th2 = new Teacher("Eyheniya","Genzus",
				28, null, 1800, "young specialist");
		Teacher th3 = new Teacher("Haliana","Sidoric",
				29, null, 5400, "female teacher");
		Teacher th4 = new Teacher("Yauheni",  "Lastovich",
				28, null, 2500, "male teacher");

//		System.out.println("Before: " + group.toString());

		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group.addTeacher(th1);
		group.addTeacher(th2);
		group.addTeacher(th3);
		group.addTeacher(th4);

//		System.out.println("After: " + group.toString());
//
//		System.out.println(group.getStudent());

		Converter<Teacher, Methodist> converter = x ->
				new Methodist(x.getName(), x.getLastName(), x.getAge(),
						null, null, x.getGender());

		Methodist methodist = converter.convert(th1);

		methodist.addTeacher(th2);

		System.out.println("Methodist: " + methodist.toString());
		System.out.println("Teachers: ");

		group.getTeacher().stream()
				.forEach(System.out::println);

		System.out.println("Teachers on retired: ");

		group.getTeacher().stream()
				.filter(x->x.getGender().equals("retired"))
				.forEach(System.out::println);

		System.out.println("Teachers' salaries are above 2000: ");

		group.getTeacher().stream()
				.filter(x->x.gelSalry() > 2000)
				.forEach(System.out::println);



	}

}
