package org.example;

import org.example.hotel.HotelFacade;

public class Main {
    public static void main(String[] args) {
        HotelFacade hotelFacade = new HotelFacade();

        hotelFacade.bookRoom(10, "1234567890123456", 200.0);

        hotelFacade.bookRoom(9, "1234567890123456", 200.0);

        hotelFacade.bookRoom(102, "12345", 150.0);
    }
}