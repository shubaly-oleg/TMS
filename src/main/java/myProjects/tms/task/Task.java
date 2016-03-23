package myProjects.tms.task;

import myProjects.tms.interfaces.TaskInterface;

public class Task implements TaskInterface{
	private int id;
	private String name;
	
	public Task(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
}
