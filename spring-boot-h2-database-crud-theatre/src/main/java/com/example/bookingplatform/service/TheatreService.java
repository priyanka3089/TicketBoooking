package com.example.bookingplatform.service;

import com.example.bookingplatform.entity.Show;
import com.example.bookingplatform.entity.Theatre;
import com.example.bookingplatform.repository.ShowRepository;
import com.example.bookingplatform.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TheatreService {
    @Autowired
    private TheatreRepository theatreRepository;

    @Autowired
    private ShowRepository showRepository;

    public List<Theatre> getTheatresInCity(String city) {
        return theatreRepository.findByCity(city);
    }

    public void createOrUpdateShow(Show show) {
        // Add logic to create or update show
    }

    public void deleteShow(Long showId) {
        // Add logic to delete show
    }

    public List<Show> getShowsByCityAndTiming(String city, LocalDateTime timing) {
        return showRepository.findByTheatreCityAndTimingAfter(city, timing);
    }
}
