package com.clay.designp.facade;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;

class Reservation {
    private static final String RESERVATION_FILE_PATH = "src/main/java/com/clay/designp/facade/reservation.txt";

    public void reserveRoom(List<RoomDetail> availableRooms, Date date, int nights, String customer) {
        if (availableRooms.isEmpty()) {
            System.out.println("No rooms available for the selected dates");
            return;
        }

        Random random = new Random();
        int roomIndex = random.nextInt(availableRooms.size()); // select a random room from the available rooms
        RoomDetail roomDetail = availableRooms.get(roomIndex);
        roomDetail.setAvailable(false); // mark the room as booked
        saveReservation(roomDetail, date, nights, customer); // save reservation details to file
        System.out.printf("Room %d booked for %d nights starting from %s for customer %s\n",
                roomDetail.getRoomNumber(), nights, date, customer);
    }

    private void saveReservation(RoomDetail roomDetail, Date date, int nights, String customer) {
        String reservationString = String.format("%d,%s,%d,%.2f,%s\n",
                roomDetail.getRoomNumber(), date.toString(), nights, roomDetail.getPrice(), customer);

        File reservationFile = new File(RESERVATION_FILE_PATH);
        try {
            FileWriter fileWriter = new FileWriter(reservationFile, true);
            fileWriter.write(reservationString);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while saving reservation details");
            e.printStackTrace();
        }
    }
}