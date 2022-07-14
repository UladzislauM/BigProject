package package1;

import java.util.LinkedList;

public class Methodist extends People{
    private LinkedList <Teacher> teachers;

    public Methodist(String name, String lastName, int age, Address address,
                     Teacher teacher, String gender) {

        super(name, lastName, age, address, gender);
        this.teachers = new LinkedList<>();
    }

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }

    public void  addTeacher(Teacher teacherAdd){
        teachers.add(teacherAdd);
    }

    @Override
    public String toString() {
        return  getName() + " " + getLastName() + " " + getAge() + " "
                + getAddress() + " " + getTeachers() + "\n";
    }
}
