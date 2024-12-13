package org.example.subscriber;

public class LoggingListener implements EmailNotificationListener {
    private String name;

    public LoggingListener(String name) {
        this.name = name;
    }

    @Override
    public void onSuccess(String message) {
        System.out.println(name + " получил уведомление об успехе: " + message);
    }

    @Override
    public void onFailure(String error) {
        System.out.println(name + " получил уведомление об ошибке: " + error);
    }
}
