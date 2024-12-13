package org.example;

import org.example.email.EmailNotificationService;
import org.example.email.EmailService;
import org.example.subscriber.LoggingListener;
import org.example.subscriber.UserNotificationListener;

public class Main {
    public static void main(String[] args) {
        EmailNotificationService notificationService = new EmailNotificationService();

        LoggingListener logger = new LoggingListener("Логгер");
        UserNotificationListener user1 = new UserNotificationListener("Иван");
        UserNotificationListener user2 = new UserNotificationListener("Мария");

        notificationService.subscribe(logger);
        notificationService.subscribe(user1);
        notificationService.subscribe(user2);

        EmailService emailService = new EmailService(notificationService);

        emailService.sendEmail("ivan@example.com", "Привет, Иван!");
        emailService.sendEmail("maria@example.com", "Привет, Мария!");
    }
}