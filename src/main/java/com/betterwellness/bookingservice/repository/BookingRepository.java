package com.betterwellness.bookingservice.repository;

import com.betterwellness.bookingservice.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByCounsellorId(String counsellorId);

    List<Booking> findByCustomerId(String customerId);
}


