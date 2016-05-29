package myProjects.tms.manager;

import java.util.List;

public interface ManagerInterface {
    void addManager(Manager manager); //add new manager to list
    void disableManager(int id);
    List<Manager> getManagerList();
}
