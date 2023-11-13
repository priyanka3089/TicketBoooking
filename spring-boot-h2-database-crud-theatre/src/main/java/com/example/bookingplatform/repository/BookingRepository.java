package com.example.bookingplatform.repository;

import com.example.bookingplatform.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByShow_TheatreCityAndShow_TimingAfter(String city, LocalDateTime timing);
}
