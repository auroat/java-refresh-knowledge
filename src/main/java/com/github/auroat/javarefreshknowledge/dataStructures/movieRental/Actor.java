package com.github.auroat.javarefreshknowledge.dataStructures.movieRental;

import java.time.LocalDate;
import java.util.Set;

public class Actor {
    private String name;
    private LocalDate dateOfBirth;
    private Set<MovieGenre> movieGenres;

    public Actor(String name, LocalDate dateOfBirth, Set<MovieGenre> movieGenres) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.movieGenres = movieGenres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Set<MovieGenre> getMovieGenres() {
        return movieGenres;
    }

    public void setMovieGenres(Set<MovieGenre> movieGenres) {
        this.movieGenres = movieGenres;
    }
}
