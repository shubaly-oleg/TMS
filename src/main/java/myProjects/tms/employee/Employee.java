package myProjects.tms.employee;

import myProjects.tms.interfaces.EmployeeInterface;

public class Employee implements EmployeeInterface{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	
}
