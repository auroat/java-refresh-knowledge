package com.github.auroat.javarefreshknowledge.dataStructures.movieRental;

import java.util.HashSet;
import java.util.Set;

public class Movie {
    private int id;
    private String name;
    private int year;
    private String description;
    private Set<Actor> actors;

    public Movie(int id, String name, int year, String description, Set<Actor> actors) {
        this.actors = new HashSet<>();

        this.id = id;
        this.name = name;
        this.year = year;
        this.description = description;
        this.actors.addAll(actors);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }
}