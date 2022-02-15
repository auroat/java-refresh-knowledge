package com.github.auroat.javarefreshknowledge.dataStructures.movieRental;

import java.util.HashMap;
import java.util.Map;

public enum MovieGenre {
    COMEDY("Comedy"), DRAMA("Drama"), ACTION("Action");

    public final String label;

    MovieGenre(String label) {
        this.label = label;
    }

    private static final Map<String, MovieGenre> MOVIE_GENRES_BY_LABEL = new HashMap<>();

    static {
        for (MovieGenre e : values()) {
            MOVIE_GENRES_BY_LABEL.put(e.label, e);
        }
    }
}
