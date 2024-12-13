package org.example.objects;

public class OpinionSurvey extends SurveyTemplate {
    @Override
    protected void showTitle() {
        System.out.println("Опрос: Ваше мнение важно для нас!");
    }

    @Override
    protected void showQuestions() {
        System.out.println("1. Как вы оцениваете наш сервис? (1-5)");
        System.out.println("2. Что бы вы хотели улучшить?");
    }
}