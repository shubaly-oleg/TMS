package myProjects.tms.manager;

import myProjects.tms.interfaces.ManagerInterface;

public class Manager implements ManagerInterface{
	private int id;
	private String name;
	
	public Manager(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
}