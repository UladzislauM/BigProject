package package1;

public class Group {
	private String groupName;
	private int kurs;
	private Student[] student;
	private Teacher teacher;

	Group(){
		this.groupName = "Undefind";
		this.kurs = 0;
		this.student = new Student[5];
		this.teacher = new Teacher();
	}
	Group(String groupName, int kurs, int numStudents){
		this.groupName = groupName;
		this.kurs = kurs;
		this.student = new Student[numStudents];
		this.teacher = new Teacher();
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
	
	public void ChangeTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Teacher geTeacher() {
		return teacher;
	}
	
	public String toString() {
		return groupName + ", " + kurs + "\n";
	}
	
	public void DeleteStudent(Student delStudent) {
		Student[] newStudent = new Student[student.length - 1];
		int iterator = 0;
		
		for (int i = 0; i < student.length; i++) {
			if (student[i].getName() != delStudent.getName() 
			&& student[i].getLastName() != delStudent.getLastName()){
				
				iterator++;
				newStudent[iterator] = student[i];
			}
		}
		
		student = newStudent;

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
