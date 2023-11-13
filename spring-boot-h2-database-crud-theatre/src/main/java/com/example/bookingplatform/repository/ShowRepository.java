package com.example.bookingplatform.repository;

import com.example.bookingplatform.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Long> {
    List<Show> findByTheatreCityAndTimingAfter(String city, LocalDateTime timing);
}
