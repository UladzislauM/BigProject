package package1;

public class Student extends People {

	Student() {
		super("UndefinedS", "UndefinedS", 0, new Address());
	}
	
	public Student(String name, String lastName, int age, Address address) {
		super(name, lastName, age, address);
	}	

    
    public String toString() {
		return getName() + ", " + getLastName()  + ", " + getAge();
	}
}
