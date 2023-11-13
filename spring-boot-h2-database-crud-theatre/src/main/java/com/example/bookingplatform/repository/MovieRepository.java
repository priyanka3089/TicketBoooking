package com.example.bookingplatform.repository;

import com.example.bookingplatform.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
