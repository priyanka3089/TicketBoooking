package com.example.bookingplatform.controller;

import com.example.bookingplatform.entity.Show;
import com.example.bookingplatform.entity.Theatre;
import com.example.bookingplatform.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/theatres")
public class TheatreController {
    @Autowired
    private TheatreService theatreService;

    @GetMapping
    public List<Theatre> getTheatresInCity(@RequestParam String city) {
        return theatreService.getTheatresInCity(city);
    }

    @GetMapping("/shows")
    public List<Show> getShowsByCityAndTiming(@RequestParam String city, @RequestParam String timing) {
        LocalDateTime showTiming = LocalDateTime.parse(timing);
        return theatreService.getShowsByCityAndTiming(city, showTiming);
    }
}
