package org.example.email;

import org.example.subscriber.EmailNotificationListener;

import java.util.ArrayList;
import java.util.List;

public class EmailNotificationService {
    private List<EmailNotificationListener> listeners = new ArrayList<>();

    public void subscribe(EmailNotificationListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EmailNotificationListener listener) {
        listeners.remove(listener);
    }

    public void notifySuccess(String message) {
        for (EmailNotificationListener listener : listeners) {
            listener.onSuccess(message);
        }
    }

    public void notifyFailure(String error) {
        for (EmailNotificationListener listener : listeners) {
            listener.onFailure(error);
        }
    }
}
