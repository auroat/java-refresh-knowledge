package com.github.auroat.javarefreshknowledge.dataStructures.movieRental;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class MovieService {
    public List<Movie> listMovies() {
        Movie movieOne = new Movie(1, "Godfather",
                1973, "Mafia and stuff.",
                new HashSet<>(Arrays.asList(new Actor("Hugh Jackman",
                        LocalDate.of(1965, 3, 23),
                        new HashSet<>(Arrays.asList(MovieGenre.DRAMA))))));

        Movie movieTwo = new Movie(1, "SpiderMan",
                2002, "Heroes and stuff.",
                new HashSet<>(Arrays.asList(new Actor("Tobey Maguire",
                                LocalDate.of(1976, 7, 5),
                                new HashSet<>(Arrays.asList(MovieGenre.ACTION))),
                        new Actor("Drew Darrymore",
                                LocalDate.of(1976, 7, 5),
                                new HashSet<>(Arrays.asList(MovieGenre.ACTION))))));

        Movie movieThree = new Movie(1, "Antman",
                2002, "Heroes and stuff.",
                new HashSet<>(Arrays.asList(new Actor("Tobey Maguire",
                                LocalDate.of(1976, 7, 5),
                                new HashSet<>(Arrays.asList(MovieGenre.ACTION))),
                        new Actor("Drew Darrymore",
                                LocalDate.of(1976, 7, 5),
                                new HashSet<>(Arrays.asList(MovieGenre.ACTION))))));

        Movie movieFour = new Movie(1, "Ironman",
                2002, "Heroes and stuff.",
                new HashSet<>(Arrays.asList(new Actor("Tobey Maguire",
                                LocalDate.of(1976, 7, 5),
                                new HashSet<>(Arrays.asList(MovieGenre.ACTION))),
                        new Actor("Drew Darrymore",
                                LocalDate.of(1976, 7, 5),
                                new HashSet<>(Arrays.asList(MovieGenre.ACTION))))));

        Movie movieFive = new Movie(1, "Wasp woman",
                2002, "Heroes and stuff.",
                new HashSet<>(Arrays.asList(new Actor("Tobey Maguire",
                                LocalDate.of(1976, 7, 5),
                                new HashSet<>(Arrays.asList(MovieGenre.ACTION))),
                        new Actor("Drew Darrymore",
                                LocalDate.of(1976, 7, 5),
                                new HashSet<>(Arrays.asList(MovieGenre.ACTION))))));

        return Arrays.asList(movieOne, movieTwo, movieThree, movieFour, movieFive);
    }

    public List<Movie> listMoviesSortedByName() {
        final List<Movie> moviesList = listMovies();
        moviesList.sort(Comparator.comparing(Movie::getName));

        return moviesList;
    }
}
