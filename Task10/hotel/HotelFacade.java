package org.example.hotel;

public class HotelFacade {
    private RoomBooking roomBooking;
    private PaymentSystem paymentSystem;

    public HotelFacade() {
        this.roomBooking = new RoomBooking();
        this.paymentSystem = new PaymentSystem();
    }

    public void bookRoom(int roomNumber, String cardNumber, double amount) {
        if (roomBooking.isRoomAvailable(roomNumber)) {
            if (paymentSystem.processPayment(cardNumber, amount)) {
                roomBooking.bookRoom(roomNumber);
            } else {
                System.out.println("Оплата не произведена, бронирование не завершено.");
            }
        } else {
            System.out.println("Комната " + roomNumber + " недоступна.");
        }
    }
}
