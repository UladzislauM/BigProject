package package1;

import java.util.LinkedList;

public class Group {
	private String groupName;
	private int kurs;
	private LinkedList<Student> student;
	private LinkedList<Teacher> teacher;

	Group(){
		this.groupName = "Undefind";
		this.kurs = 0;
		this.student = new LinkedList<Student>();
		this.teacher = new LinkedList<Teacher>();
	}
	Group(String groupName, int kurs){
		this.groupName = groupName;
		this.kurs = kurs;
		this.student = new LinkedList<Student>();
		this.teacher = new LinkedList<Teacher>();
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public void setKurs(int kurs) {
		if(kurs > 0){
			this.kurs = kurs;
	    }
	}

	public String getGroupName() {
		return groupName;
	}
	public int getKurs() {
		return kurs;
	}

	public String toString() {
		return groupName + ", " + kurs + "\n";
	}
	
	public void DeleteStudent(Student delStudent) {
		LinkedList<Student> newStudent = new LinkedList<Student>();
		int iterator = 0;
		
		for (int i = 0; i < student.size(); i++) {
			if (student.element().getName() != delStudent.getName()
			&& student.element().getLastName() != delStudent.getLastName()){
				
				iterator++;
				student.add(newStudent.get(i));
			}
		}
		
		student.addAll(newStudent);

	}
	
	public void AddStudent(Student addStudent) {
		Student[] newStudent = new Student[student.length + 1];
		
		for (int i = 0; i < student.length; i++) {
			newStudent[i] = student[i];
		}
		
		newStudent[newStudent.length - 1] = addStudent;
		
		student = newStudent;

	}
	
}
