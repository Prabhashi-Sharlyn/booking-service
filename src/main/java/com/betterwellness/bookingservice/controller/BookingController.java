package com.betterwellness.bookingservice.controller;

import com.betterwellness.bookingservice.model.Booking;
import com.betterwellness.bookingservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public ResponseEntity<String> createBooking(@RequestBody Booking booking) {
        bookingService.createBooking(booking);
        return ResponseEntity.ok("Booking created successfully");
    }

    @GetMapping("/counsellor/{counsellorId}")
    public ResponseEntity<List<Booking>> getCounsellorBookings(@PathVariable String counsellorId) {
        List<Booking> bookings = bookingService.getBookingsByCounsellor(counsellorId);
        return ResponseEntity.ok(bookings);
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Booking>> getCustomerBookings(@PathVariable String customerId) {
        List<Booking> bookings = bookingService.getBookingsByCustomer(customerId);
        return ResponseEntity.ok(bookings);
    }
}

