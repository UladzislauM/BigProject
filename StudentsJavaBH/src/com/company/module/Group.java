package com.company.module;

import org.junit.experimental.theories.Theories;

import java.util.ArrayList;
import java.util.LinkedList;

public class Group {
	private String groupName;
	private int kurs;
	private LinkedList<Student> student;
	private LinkedList<Teacher> teacher;
	private int inYear;
	private int outYear;

	public Group(){
		this.groupName = "Undefind";
		this.kurs = 0;
		this.student = new LinkedList<Student>();
		this.teacher = new LinkedList<Teacher>();
		this.inYear = 0;
		this.outYear = 0;
	}
	public Group(String groupName, int kurs, int inYear, int outYear,
				 LinkedList<Student> students, LinkedList<Teacher> teachers) {
		this.groupName = groupName;
		this.kurs = kurs;
		this.student = new LinkedList<Student>(){{
			addAll(students);
		}};
		this.teacher = new LinkedList<Teacher>(){{
			addAll(teachers);
		}};
		this.inYear = inYear;
		this.outYear = outYear;
	}

public Group(String groupName, int kurs, int inYear, int outYear) {
		this.groupName = groupName;
		this.kurs = kurs;
		this.student = new LinkedList<Student>();
		this.teacher = new LinkedList<Teacher>();
		this.inYear = inYear;
		this.outYear = outYear;
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
	public int getInYear() {
		return inYear;
	}

	public void setInYear(int inYear) {
		this.inYear = inYear;
	}

	public int getOutYear() {
		return outYear;
	}

	public void setOutYear(int outYear) {
		this.outYear = outYear;
	}

	public String toString() {
		return groupName + ", " + kurs + ", in year" + inYear
				+ ", number of students - " + student.size();
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
