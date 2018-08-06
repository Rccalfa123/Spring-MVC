package in.com.cg.employeebean;

public class Employee {

	private String Name;
	private final int ID;
	private double salary;
	private static int counter=200;
	{
		ID = counter++; 
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", ID=" + ID + ", salary=" + salary + "]";
	}

	public String getName() {
		return Name;
	}

	public int getID() {
		return ID;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}
