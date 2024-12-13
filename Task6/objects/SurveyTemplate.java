package org.example.objects;

public abstract class SurveyTemplate {
    public void displaySurvey() {
        showTitle();
        showQuestions();
        showFooter();
    }

    protected abstract void showTitle();
    protected abstract void showQuestions();

    protected void showFooter() {
        System.out.println("Спасибо за участие!");
    }
}
