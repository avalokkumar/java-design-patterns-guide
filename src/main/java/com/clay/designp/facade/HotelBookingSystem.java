package com.clay.designp.facade;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// Facade class
class HotelBookingSystem {
    private Room room;
    private Reservation reservation;
    private Report report;

    private Map<Date, Boolean[]> availabilityMap;

    public HotelBookingSystem() {
        this.reservation = new Reservation();
        this.report = new Report();
        this.availabilityMap = new HashMap<>();

        // Initialize availabilityMap with mock data
        Boolean[] availability = {true, true, true, false, false, true, true}; // represents room availability for each day of the week (Sunday to Saturday)
        for (int i = 0; i < 7; i++) {
            Date date = new Date(System.currentTimeMillis() + i * 24 * 60 * 60 * 1000L); // add i days to current time
            availabilityMap.put(date, availability);
        }
    }

    public boolean checkAvailability(Date date, int nights) {
        return Room.isAvailable(123, date, nights);
    }

    public void makeReservation(Date date, int nights, String customer) {
        Room availableRoom = findAvailableRoom(date, nights);
        reservation.reserveRoom(availableRoom, date, nights, customer);
    }

    public void generateOccupancyReport(Date startDate, Date endDate) {
        report.generateOccupancyReport(startDate, endDate);
    }

    public void generateRevenueReport(Date startDate, Date endDate) {
        report.generateRevenueReport(startDate, endDate);
    }

    private Room findAvailableRoom(Date date, int nights) {
        Boolean[] availability = availabilityMap.get(date); // get room availability for the given date
        if (availability == null) {
            throw new IllegalArgumentException("Invalid date");
        }

        int availableRoomNumber = -1;
        for (int i = 0; i <= availability.length - nights; i++) {
            boolean available = true;
            for (int j = 0; j < nights; j++) {
                if (!availability[i + j]) {
                    available = false;
                    break;
                }
            }
            if (available) {
                availableRoomNumber = i + 1;
                break;
            }
        }

        if (availableRoomNumber == -1) {
            throw new IllegalArgumentException("No room available for the given date range");
        }

        return Room.getBookings(availableRoomNumber);
    }
}