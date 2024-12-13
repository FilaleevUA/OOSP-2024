package org.example.task;

public class Experiment implements Task {
    private String name;
    private String result;

    public Experiment(String name) {
        this.name = name;
        this.result = "Еще не завершено";
    }

    @Override
    public void performTask() {
        System.out.println("Проведение эксперимента: " + name);
        result = "Эксперимент " + name + " успешно выполнен";
        System.out.println(result);
    }

    @Override
    public void addTask(Task task) {
        throw new UnsupportedOperationException("У Листа не может быть подзадач.");
    }

    @Override
    public void removeTask(Task task) {
        throw new UnsupportedOperationException("У Листа не может быть подзадач.");
    }

    @Override
    public Task getTask(int index) {
        throw new UnsupportedOperationException("У Листа не может быть подзадач.");
    }

    public String getResult() {
        return result;
    }
}