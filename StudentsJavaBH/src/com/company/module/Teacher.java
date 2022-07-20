package com.company.module;

import com.company.base.Address;
import com.company.base.People;

public class Teacher extends People {
	
	private int salary;
	
	public Teacher(String name, String lastName, int age, Address address,
				   int salary, String gender) {
		super(name, lastName, age, address, gender);
		this.salary = salary;
	}

	public Teacher() {
		super("UndifindT", "UndifindT", 0,
				new Address(), "UndifindT");
		this.salary = 0;
	}

    public void setSalary(int salary) {
    	this.salary = salary;
    }

    public int getSalary() {
    	return salary;
    }
 
	public int payRollCalculation(int hoursWorked, int costPerHour) {

		salary = hoursWorked * costPerHour;
		if(salary < 0){
			return 0;
		} else {
			return salary;
		}
	}
	
	public String toString() {
		return getName() + ", " + getLastName() + ", " + getAge() + ", "
				+ salary + ", " + getGender() + " |T|";
	}
}