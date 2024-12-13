package org.example.email;

public class EmailService {
    private EmailNotificationService notificationService;

    public EmailService(EmailNotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendEmail(String recipient, String content) {
        System.out.println("Отправка письма получателю: " + recipient);
        try {
            if (Math.random() > 0.2) {
                notificationService.notifySuccess("Письмо успешно отправлено получателю: " + recipient);
            } else {
                throw new Exception("Сбой при отправке письма получателю: " + recipient);
            }
        } catch (Exception e) {
            notificationService.notifyFailure(e.getMessage());
        }
    }
}
