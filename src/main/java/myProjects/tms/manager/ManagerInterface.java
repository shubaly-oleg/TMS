package myProjects.tms.manager;

import java.util.List;

public interface ManagerInterface {
    void addManager(int id, String name); //add new manager
    void disableManager(int id);
    List<Manager> getManagerList();
}
