package org.example.subscriber;

public interface EmailNotificationListener {
    void onSuccess(String message);
    void onFailure(String error);
}