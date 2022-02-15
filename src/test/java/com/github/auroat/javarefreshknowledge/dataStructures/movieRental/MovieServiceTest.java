package com.github.auroat.javarefreshknowledge.dataStructures.movieRental;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
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

        moviesResult.get(0).getActors().stream().forEach(actor -> {
            assertThat(Arrays.asList("Hugh Jackman", "Drew Darrymore"), hasItem(actor.getName()));
        });
        // How to intelligently compare values when there are more than 1 values in a Set?
    }
}
