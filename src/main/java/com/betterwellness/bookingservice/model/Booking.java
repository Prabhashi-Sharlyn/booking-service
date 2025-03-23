package com.betterwellness.bookingservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "counsellor_id", nullable = false)
    private String counsellorId;

    @Column(name = "counsellor_name", nullable = false)
    private String counsellorName;

    @Column(name = "session_date", nullable = false)
    private String sessionDate;

    @Column(name = "session_time", nullable = false)
    private String sessionTime;

    @Column(name = "session", nullable = false)
    private String session;
}

