package org.example.hotel;

class PaymentSystem {
    public boolean processPayment(String cardNumber, double amount) {
        if (cardNumber == null || cardNumber.length() != 16) {
            System.out.println("Неверный номер карты.");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Недействительная сумма платежа.");
            return false;
        }

        System.out.println("Выплата $ " + amount + " успешно обработан с помощью карты " + cardNumber);
        return true;
    }
}
