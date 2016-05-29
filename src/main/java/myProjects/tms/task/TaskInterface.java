package myProjects.tms.task;

import java.util.List;

public interface TaskInterface {
    void addTask(Task task); //add new task to list
    void pauseTask(int id);
    void finishTask(int id);
    List<Task> getTaskList();
//  void removeTask(Task task);
//  void removeAllTasks();
}
