package com.betterwellness.bookingservice.service;

import com.betterwellness.bookingservice.model.Booking;
import com.betterwellness.bookingservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public void createBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public List<Booking> getBookingsByCounsellor(String counsellorId) {
        return bookingRepository.findByCounsellorId(counsellorId);
    }

    public List<Booking> getBookingsByCustomer(String customerId) {
        return bookingRepository.findByCustomerId(customerId);
    }
}

