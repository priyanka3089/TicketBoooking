package com.example.bookingplatform.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String language;
    private String genre;

    // constructors, getters, setters
}
