package com.example.bookingplatform.controller;

import com.example.bookingplatform.entity.Booking;
import com.example.bookingplatform.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public String bookTickets(@RequestParam Long showId, @RequestParam String customerName, @RequestParam int numberOfSeats) {
        return bookingService.bookTickets(showId, customerName, numberOfSeats);
    }

    @PostMapping("/bulk")
    public String bulkBooking(@RequestParam Long theatreId, @RequestParam Long showId, @RequestParam int numberOfSeats) {
        return bookingService.bulkBooking(theatreId, showId, numberOfSeats);
    }

    @GetMapping("/bookings")
    public List<Booking> getBookingsByCityAndTiming(@RequestParam String city, @RequestParam String timing) {
        LocalDateTime showTiming = LocalDateTime.parse(timing);
        return bookingService.getBookingsByCityAndTiming(city, showTiming);
    }
}
