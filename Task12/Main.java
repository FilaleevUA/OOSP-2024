package org.example;

import org.example.task.Experiment;
import org.example.task.ResearchProject;

public class Main {
    public static void main(String[] args) {
        Experiment experiment1 = new Experiment("Эксперимент 1");
        Experiment experiment2 = new Experiment("Эксперимент 2");

        ResearchProject project = new ResearchProject("Исследовательский проект 1");

        project.addTask(experiment1);
        project.addTask(experiment2);

        project.performTask();

        System.out.println(experiment1.getResult());
        System.out.println(experiment2.getResult());

        ResearchProject subProject = new ResearchProject("Подпроект 1");
        subProject.addTask(new Experiment("Подпроект 1.1"));
        subProject.addTask(new Experiment("Подпроект 1.2"));

        project.addTask(subProject);

        project.performTask();
    }
}