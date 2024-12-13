package org.example.task;

import java.util.ArrayList;
import java.util.List;

public class ResearchProject implements Task {
    private String name;
    private List<Task> tasks = new ArrayList<>();

    public ResearchProject(String name) {
        this.name = name;
    }

    @Override
    public void performTask() {
        System.out.println("Выполнение задач для проекта: " + name);
        for (Task task : tasks) {
            task.performTask();
        }
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public Task getTask(int index) {
        return tasks.get(index);
    }

    public void printTasks() {
        System.out.println("Задачи для проекта " + name + ":");
        for (Task task : tasks) {
            task.performTask();
        }
    }
}
