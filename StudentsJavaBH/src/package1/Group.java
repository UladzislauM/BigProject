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

	public void addStudent (Student studentAdd){
		student.add(studentAdd);
	}

	public void dellStudent (Student studentAdd) {
		student.remove(studentAdd);
	}

	public void addTeacher (Teacher teacherAdd){
		teacher.add(teacherAdd);
	}

	public void dellTeacher (Teacher teacherDell){
		teacher.remove(teacherDell);
	}

	public LinkedList<Student> getStudent() {
		return student;
	}

	public LinkedList<Teacher> getTeacher() {
		return teacher;
	}

}
