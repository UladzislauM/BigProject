package package1;

public class Main {

	public static void main(String[] args) {
		
		Group group = new Group("11A", 11, 3);
		
		Student st1 = new Student("Vas", "Blinsk",28, null);
		Student st2 = new Student("Jek", "Blinsk",27, null);
		Student st3 = new Student("Vlad", "Mir",29, null);
		
		Student stAddDell = new Student("Vas", "Blinsk",28, null);
		
		group.AddStudent(st1);
		group.AddStudent(st2);
		group.AddStudent(st3);
		
		System.out.println("Before: " + group.toString());
		
		Teacher teacher = new Teacher();
		System.out.println(teacher.toString());
		
//		System.out.println("Before: " + group.toString());

//		group.DeleteStudent(stAddDell);
//		
//		System.out.println("After Dell: " + group.toString());
//		
//		group.AddStudent(stAddDell);
//		
//		System.out.println("After Add: " + group.toString());

	}

}
