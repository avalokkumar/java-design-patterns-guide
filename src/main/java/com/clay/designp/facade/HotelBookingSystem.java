package com.clay.designp.facade;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Facade class
class HotelBookingSystem {
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
        return Room.isAvailable(date, nights);
    }

    public void makeReservation(Date date, int nights, String customer) {
        List<RoomDetail> availableRooms = Room.getAvailableRooms(date, nights);
        System.out.printf("Available Rooms are " + availableRooms);
        reservation.reserveRoom(availableRooms, date, nights, customer);
    }

    public void generateOccupancyReport(Date startDate, Date endDate) {
        report.generateOccupancyReport(startDate, endDate);
    }

    public void generateRevenueReport(Date startDate, Date endDate) {
        report.generateRevenueReport(startDate, endDate);
    }
}