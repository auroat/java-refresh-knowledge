package com.github.auroat.javarefreshknowledge.dataStructures.movieRental;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
}
