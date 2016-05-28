package myProjects.tms.employee;

import java.util.List;

public interface EmployeeInterface {
    void addEmployee(int id, String name); //add new Employee
    void disableEmployee(int id);
    List<Employee> getEmployeeList();
}
