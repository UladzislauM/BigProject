package package1;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Group group = new Group("11A", 11);
		
		Student st1 = new Student("Vas",
				"Blinsk",28, null);
		Student st2 = new Student("Jek",
				"Blinsk",27, null);
		Student st3 = new Student("Vlad",
				"Mir",29, null);

		Teacher th1 = new Teacher("Tatyana",
				"Mex", 21, null, 1500);
		Teacher th2 = new Teacher("Eyheniya",
				"Genzus", 28, null, 1800);

		System.out.println("Before: " + group.toString());

		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group.addTeacher(th1);
		group.addTeacher(th2);

		System.out.println("After: " + group.toString());

		System.out.println(group.getStudent());
		System.out.println(group.getTeacher());
	}

}
