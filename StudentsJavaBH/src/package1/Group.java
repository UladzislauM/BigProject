package package1;

import java.util.LinkedList;

public class Group {
	private String groupName;
	private int kurs;
	private LinkedList<Student> student;
	private Teacher teacher;



	Group(){
		this.groupName = "Undefind";
		this.kurs = 0;
		this.student = new LinkedList<Student>();
		this.teacher = new Teacher();
	}
	Group(String groupName, int kurs, Teacher teacher){
		this.groupName = groupName;
		this.kurs = kurs;
		this.student = new LinkedList<Student>();
		this.teacher = teacher;
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public void setKurs(int kurs) {
		if(kurs > 0){
			this.kurs = kurs;
	    }
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public String getGroupName() {
		return groupName;
	}
	public int getKurs() {
		return kurs;
	}

	public String toString() {
			return groupName + ", " + kurs + "," +  teacher + "\n";
	}

	public void addStudent (Student studentAdd){
		student.add(studentAdd);
	}

	public void dellStudent (Student studentAdd) {
		student.remove(studentAdd);
	}

	public LinkedList<Student> getStudent() {
		return student;
	}


}
