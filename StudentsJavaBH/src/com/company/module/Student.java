package com.company.module;

import com.company.base.Address;
import com.company.base.People;

public class Student extends People {

	public Student(){
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
