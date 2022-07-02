package package1;

public class Group {
	private String groupName;
	private int kurs;

	private Student[] student;
	private Teacher[] teacher;

	Group(){
		this.groupName = "Undefind";
		this.kurs = 0;
		this.student = new Student[5];
		this.teacher = new Teacher[1];
	}
	Group(String groupName, int kurs, int numStudents, int numTeachers){
		this.groupName = groupName;
		this.kurs = kurs;
		this.student = new Student[numStudents];
		this.teacher = new Teacher[numTeachers];
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

	public Student[] getStudent() {
		return student;
	}

	public Teacher[] getTeacher() {
		return teacher;
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

	public void DeleteTheacher(Teacher delTeacher) {
		Teacher[] newTeachrs = new Teacher[teacher.length - 1];
		int iterator = 0;

		for (int i = 0; i < teacher.length; i++) {
			if (teacher[i].getName() != delTeacher.getName()
					&& teacher[i].getLastName() != delTeacher.getLastName()){

				iterator++;
				newTeachrs[iterator] = teacher[i];
			}
		}

		teacher = newTeachrs;

	}

	public void AddTeacher(Teacher addTeacher){
		Teacher[] newTeachrs = new Teacher[teacher.length + 1];

		for (int i = 0; i < teacher.length; i++) {
			newTeachrs[i] = teacher[i];
		}

		newTeachrs[newTeachrs.length - 1] = addTeacher;

		teacher = newTeachrs;

	}
	
}
