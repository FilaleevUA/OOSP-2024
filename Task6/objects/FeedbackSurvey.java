package org.example.objects;

public class FeedbackSurvey extends SurveyTemplate {
    @Override
    protected void showTitle() {
        System.out.println("Анкета обратной связи: Мы ценим ваш отзыв!");
    }

    @Override
    protected void showQuestions() {
        System.out.println("1. Что вам понравилось в нашей работе?");
        System.out.println("2. Какие у вас есть предложения?");
    }
}
