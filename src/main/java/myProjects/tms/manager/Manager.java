package myProjects.tms.manager;

public class Manager implements ManagerInterface{
	
//	List<Task> tasks = new LinkedList<Task>();
//    List<Employee> employees = new LinkedList<Employee>();
	
	private int id;
	private String name;
	
	public Manager(int id, String name) {
		this.id = id;
		this.name = name;
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
}
