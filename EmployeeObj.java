package rnd.collections;

public class EmployeeObj {
	int id;
	String name;
	int salary;
	
	
	public EmployeeObj(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return id+" :: "+name+" :: "+salary;
	}
	
	
}
