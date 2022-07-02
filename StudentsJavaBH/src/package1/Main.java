package package1;

public class Main {

	public static void main(String[] args) {
		
		Group group = new Group("11A", 11, 3, 2);
		
		Student st1 = new Student("Vas", "Blinsk",28, null);
		Student st2 = new Student("Jek", "Blinsk",27, null);
		Student st3 = new Student("Vlad", "Mir",29, null);

		Teacher ch1 = new Teacher("Tatyana", "Mex", 21, null, 1500);
		Teacher ch2 = new Teacher("Yaheniya", "Gutenberg", 28, null, 1800);

		System.out.println("Before: " + group.toString());
		
		group.AddStudent(st1);
		group.AddStudent(st2);
		group.AddStudent(st3);

		group.AddTeacher(ch1);
		group.AddTeacher(ch2);

		System.out.println("After: " + group.toString());

		for (Student st:
				group.getStudent()) {
			System.out.println(st);
		}

		for (Teacher ch:
				group.getTeacher()) {
			System.out.println(ch);
		}
	}

}
