package com.clay.designp.facade;

import java.util.*;

public class Room {
    private static Map<Integer, RoomDetail> bookings = new HashMap<>();

    static {
        // Initialize the bookings map with some mock data
        RoomDetail room1 = new RoomDetail(true, 11, new Date(1220227200000L), new Date(1220486400000L));
        bookings.put(11, room1);

        RoomDetail room2 = new RoomDetail(true, 12, new Date(), new Date(1520400000000L));
        bookings.put(12, room2);

        RoomDetail room3 = new RoomDetail(true, 13, new Date(), new Date(1240486400000L));
        bookings.put(13, room3);

        RoomDetail room4 = new RoomDetail(false, 14, new Date(1220313600000L), new Date(1220486400000L));
        bookings.put(14, room4);

        RoomDetail room5 = new RoomDetail(true, 15, new Date(), new Date(1683657600000L));
        bookings.put(15, room5);

        RoomDetail room6 = new RoomDetail(true, 16, new Date(), new Date(1739971200000L));
        bookings.put(16, room6);

        RoomDetail room7 = new RoomDetail(true, 17, new Date(1650393600000L), new Date(1650566400000L));
        bookings.put(17, room7);

        RoomDetail room8 = new RoomDetail(false, 18, new Date(1643145600000L), new Date(1643404800000L));
        bookings.put(18, room8);

        RoomDetail room9 = new RoomDetail(true, 19, new Date(1691097600000L), new Date(1691260800000L));
        bookings.put(19, room9);

        RoomDetail room10 = new RoomDetail(true, 20, new Date(1722540800000L), new Date(1722704000000L));
        bookings.put(20, room10);

    }

    public static boolean isAvailable(Date startDate, int nights) {
        // Check availability logic
        for (Map.Entry<Integer, RoomDetail> entry : bookings.entrySet()) {
            RoomDetail roomDetail = entry.getValue();
            if (roomDetail.isAvailable() && isRoomAvailableForDates(roomDetail, startDate, nights)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isRoomAvailableForDates(RoomDetail roomDetail, Date startDate, int nights) {
        Date endDate = new Date(startDate.getTime() + (long) (nights - 1) * 24 * 60 * 60 * 1000);
        Date bookedStartDate = roomDetail.getStartDate();
        Date bookedEndDate = roomDetail.getEndDate();
        return !(startDate.before(bookedStartDate) && endDate.before(bookedStartDate) ||
                startDate.after(bookedEndDate) && endDate.after(bookedEndDate));
    }


    public static List<RoomDetail> getAvailableRooms(Date startDate, int nights) {
        List<RoomDetail> availableRooms = new ArrayList<>();
        for (Map.Entry<Integer, RoomDetail> entry : bookings.entrySet()) {
            RoomDetail roomDetail = entry.getValue();
            if (roomDetail.isAvailable() && isRoomAvailableForDates(roomDetail, startDate, nights)) {
                availableRooms.add(roomDetail);
            }
        }
        return availableRooms;
    }
}