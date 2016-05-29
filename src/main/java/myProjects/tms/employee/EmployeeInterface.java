package myProjects.tms.employee;

import java.util.List;

public interface EmployeeInterface {
    void addEmployee(Employee employee); //add new Employee to list
    void disableEmployee(int id);
    List<Employee> getEmployeeList();
}
