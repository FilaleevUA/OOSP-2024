package org.example.objects;

public class QuizSurvey extends SurveyTemplate {
    @Override
    protected void showTitle() {
        System.out.println("Тест: Проверьте свои знания!");
    }

    @Override
    protected void showQuestions() {
        System.out.println("1. Что такое паттерн проектирования?");
        System.out.println("2. Какие паттерны относятся к структурным?");
    }
}
