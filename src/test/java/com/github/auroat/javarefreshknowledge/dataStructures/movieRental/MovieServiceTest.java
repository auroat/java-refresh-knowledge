package com.github.auroat.javarefreshknowledge.dataStructures.movieRental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

public class MovieServiceTest {
    MovieService movieService;

    public MovieServiceTest() {
        movieService = new MovieService();
    }

    @Test
    public void listMovies() {
        List<Movie> moviesResult = movieService.listMovies();
        List<String> expectedActors = Arrays.asList("Hugh Jackman", "Drew Darrymore", "Tobey Maguire");

        moviesResult.stream().forEach(movie -> {
            movie.getActors().stream().forEach(actor -> {
                assertThat(expectedActors, hasItem(actor.getName()));
            });
        });
    }

    @Test
    public void listMoviesSorted() {
        List<Movie> moviesResult = movieService.listMoviesSortedByName();
        List<String> expectedActorsSorted = Arrays.asList("Antman", "Godfather", "Ironman", "SpiderMan", "Wasp woman");
        List<String> moviesNamesResult = new ArrayList<>();

        moviesResult.stream().forEach(movie -> {
            moviesNamesResult.add(movie.getName());
        });

        assertThat(moviesNamesResult.containsAll(expectedActorsSorted), is(true));
    }
}
