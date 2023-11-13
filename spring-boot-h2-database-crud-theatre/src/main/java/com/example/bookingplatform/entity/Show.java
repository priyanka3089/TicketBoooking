package com.example.bookingplatform.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;

    private LocalDateTime timing;

    // constructors, getters, setters
}
