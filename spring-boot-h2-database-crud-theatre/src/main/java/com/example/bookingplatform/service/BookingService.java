package com.example.bookingplatform.service;

import com.example.bookingplatform.entity.Booking;
import com.example.bookingplatform.entity.Show;
import com.example.bookingplatform.repository.BookingRepository;
import com.example.bookingplatform.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ShowRepository showRepository;

    public String bookTickets(Long showId, String customerName, int numberOfSeats) {
        Show show = showRepository.findById(showId).orElse(null);
        if (show != null) {
            // Add logic to book tickets
            return "Booking successful.";
        } else {
            return "Show not found.";
        }
    }

    public String bulkBooking(Long theatreId, Long showId, int numberOfSeats) {
        // Add logic for bulk booking
        return "Bulk booking successful.";
    }

    public List<Booking> getBookingsByCityAndTiming(String city, LocalDateTime timing) {
        return bookingRepository.findByShow_TheatreCityAndShow_TimingAfter(city, timing);
    }
}
