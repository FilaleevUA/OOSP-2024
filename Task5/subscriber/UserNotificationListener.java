package org.example.subscriber;

public class UserNotificationListener implements EmailNotificationListener {
    private String username;

    public UserNotificationListener(String username) {
        this.username = username;
    }

    @Override
    public void onSuccess(String message) {
        System.out.println("Пользователь " + username + " уведомлён об успехе: " + message);
    }

    @Override
    public void onFailure(String error) {
        System.out.println("Пользователь " + username + " уведомлён об ошибке: " + error);
    }
}
