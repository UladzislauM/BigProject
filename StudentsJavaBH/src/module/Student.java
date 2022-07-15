package module;

import base.Address;
import base.People;

public class Student extends People {

	Student(){
		super("UndefinedS", "UndefinedS", 0,
				new Address(), "UndefinedS");
	}
	
	public Student(String name, String lastName, int age, Address address, String gender) {
		super(name, lastName, age, address, gender);
	}	

    
    public String toString() {

		return getName() + ", " + getLastName()  + ", " + getAge() + ", " + getGender();
	}
}
