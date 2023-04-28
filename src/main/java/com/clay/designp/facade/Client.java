package com.clay.designp.facade;

import java.util.Date;

// Client code
class Client {
    public static void main(String[] args) {
        HotelBookingSystem hotel = new HotelBookingSystem();

        // Check availability
        boolean available = hotel.checkAvailability(new Date(), 3);
        System.out.println("Room available: " + available);

        // Make a reservation
        hotel.makeReservation(new Date(), 3, "John Doe");

        // Generate reports
        hotel.generateOccupancyReport(new Date(), new Date());
        hotel.generateRevenueReport(new Date(), new Date());
    }
}