package myProjects.tms.task;

import java.util.List;

public interface TaskInterface {
    void addTask(int id, String name); //add new manager
    void pauseTask(int id);
    void finishTask(int id);
    List<Task> getTaskList();
//  void removeTask(Task task);
//  void removeAllTasks();
}
