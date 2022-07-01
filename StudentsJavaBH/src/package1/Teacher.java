package package1;

public class Teacher extends People{
	
	private int salary;
	
	public Teacher(String name, String lastName, int age, Address address, int salary) {
		super(name, lastName, age, address);
		this.salary = salary;
	}

	public Teacher() {
		super("UndifindT", "UndifindT", 0, new Address());
		this.salary = 0;
	}

    public void setSalary(int salary) {
    	this.salary = salary;
    }

    public int gelSalry() {
    	return salary;
    }
 
	public int payRollCalculation(int hoursWorked, int costPerHour) {
		salary = hoursWorked * costPerHour;
		return salary;
	}
	
	public String toString() {
		return getName() + ", " + getLastName() + ", " + getAge() + ", " + salary 
				+"\n" + getAddress().toString();
	}
}