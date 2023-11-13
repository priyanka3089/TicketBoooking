package com.example.bookingplatform.entity;

import jakarta.persistence.*;

@Entity
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;

    // constructors, getters, setters
}
