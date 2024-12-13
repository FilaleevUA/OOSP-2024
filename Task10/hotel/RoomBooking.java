package org.example.hotel;

class RoomBooking {
    private boolean[] rooms = new boolean[100];

    public boolean isRoomAvailable(int roomNumber) {
        if (roomNumber < 0 || roomNumber >= rooms.length) {
            System.out.println("Неверный номер комнаты");
            return false;
        }
        return !rooms[roomNumber];
    }

    public void bookRoom(int roomNumber) {
        if (roomNumber >= 0 && roomNumber < rooms.length && !rooms[roomNumber]) {
            rooms[roomNumber] = true;
            System.out.println("Комната " + roomNumber + " была успешно забронирован.");
        } else {
            System.out.println("Комната " + roomNumber + " недоступна.");
        }
    }
}
