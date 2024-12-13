package org.example.task;

public interface Task {
    void performTask();
    void addTask(Task task);
    void removeTask(Task task);
    Task getTask(int index);
}
