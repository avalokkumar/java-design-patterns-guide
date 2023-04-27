package com.clay.designp.facade;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Room {
    private static Map<Integer, Map<Date, Boolean>> bookings = new HashMap<>();

    static {
        // Initialize the bookings map with some mock data
        Map<Date, Boolean> bookingsForRoom1 = new HashMap<>();
        bookingsForRoom1.put(new Date(1220227200000L), true); // 1st Sep 2008
        bookingsForRoom1.put(new Date(1220313600000L), true); // 2nd Sep 2008
        bookingsForRoom1.put(new Date(1220400000000L), false); // 3rd Sep 2008
        bookingsForRoom1.put(new Date(1220486400000L), true); // 4th Sep 2008
        bookings.put(1, bookingsForRoom1);

        Map<Date, Boolean> bookingsForRoom2 = new HashMap<>();
        bookingsForRoom2.put(new Date(1220227200000L), true); // 1st Sep 2008
        bookingsForRoom2.put(new Date(1220313600000L), true); // 2nd Sep 2008
        bookingsForRoom2.put(new Date(1220400000000L), false); // 3rd Sep 2008
        bookings.put(2, bookingsForRoom2);

        Map<Date, Boolean> bookingsForRoom3 = new HashMap<>();
        bookingsForRoom3.put(new Date(1220313600000L), true); // 2nd Sep 2008
        bookingsForRoom3.put(new Date(1220400000000L), false); // 3rd Sep 2008
        bookingsForRoom3.put(new Date(1220486400000L), true); // 4th Sep 2008
        bookings.put(3, bookingsForRoom3);
    }

    public static boolean isAvailable(int roomNumber, Date startDate, int nights) {
        // Check availability logic
        Map<Date, Boolean> bookingsForRoom = bookings.get(roomNumber);
        if (bookingsForRoom == null) {
            // Room doesn't exist
            return false;
        }
        for (int i = 0; i < nights; i++) {
            Date date = new Date(startDate.getTime() + i * 24 * 60 * 60 * 1000);
            Boolean isBooked = bookingsForRoom.get(date);
            if (isBooked != null && isBooked) {
                // Room is already booked for this date
                return false;
            }
        }
        return true;
    }

    public static Room getBookings(int roomNum) {
        Map<Date, Boolean> availableBooking = bookings.get(roomNum);
        return new Room();
    }
}