package hcmute.models;

import java.io.Serializable;

public class EmployeeModel implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int salary;
	public EmployeeModel() {
		super();
	}
	public EmployeeModel(int id, String name, int salary) {
		super();
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
		return "EployeeModel [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
