package module;

import base.Address;

import java.util.LinkedList;

public class Methodist extends Teacher {
    private LinkedList <Teacher> teachers;

    public Methodist(String name, String lastName, int age, Address address,
                     int salary, String gender, LinkedList<Teacher> teachers) {
        super(name, lastName, age, address, salary, gender);
        this.teachers = new LinkedList<>();
    }

    public Methodist() {
        teachers = new LinkedList<>();
    }

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }

    public void  addTeacher(Teacher teacherAdd){
        teachers.add(teacherAdd);
    }

    @Override
    public String toString() {
        return  getName() + ", " + getLastName() + ", " + getAge() + ", "
                + getAddress() + ", " + getSalary() + ", " + getGender()
                + ", number of teachers in subordination: " + teachers.size();
    }
}
