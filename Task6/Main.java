package org.example;

import org.example.objects.FeedbackSurvey;
import org.example.objects.OpinionSurvey;
import org.example.objects.QuizSurvey;
import org.example.objects.SurveyTemplate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Опрос ===");
        SurveyTemplate opinionSurvey = new OpinionSurvey();
        opinionSurvey.displaySurvey();

        System.out.println("\n=== Тест ===");
        SurveyTemplate quizSurvey = new QuizSurvey();
        quizSurvey.displaySurvey();

        System.out.println("\n=== Анкета обратной связи ===");
        SurveyTemplate feedbackSurvey = new FeedbackSurvey();
        feedbackSurvey.displaySurvey();
    }
}