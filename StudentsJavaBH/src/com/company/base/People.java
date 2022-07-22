package com.company.base;

import com.company.module.Address;

public abstract class People implements Comparable<People>{


	private String name;
	private String lastName;
	private int age;
	private Address address;

	private String gender;
	
	public People(String name, String lastName, int age,
				  Address address, String gender) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0){
			System.out.println("the age cannot be less than 0");
		}else {
			this.age = age;
		}
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int compareTo(People o) {
		if(lastName.compareTo(o.getLastName()) == 0){
			if (age - o.getAge() == 0){
				return o.getAge() - age;
			}
			return o.getLastName().compareTo(lastName);
		}
		return o.getName().compareTo(name);
	}
}
