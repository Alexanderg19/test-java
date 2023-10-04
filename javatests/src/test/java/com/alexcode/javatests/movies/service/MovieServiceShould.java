package com.alexcode.javatests.movies.service;

import com.alexcode.javatests.movies.data.MovieRepository;
import com.alexcode.javatests.movies.model.Genre;
import com.alexcode.javatests.movies.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.Assert.*;


public class MovieServiceShould {
    private MovieService movieService;

    @Before
    public void setUp() throws Exception {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Marty", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION),
                        new Movie(8, "Superman", 142, Genre.ACTION)
                )
        );

        movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movie_by_genre() {
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        assertEquals(Arrays.asList(3, 6), getMoviesByIds(movies));
    }

    @Test
    public void return_movie_by_length() {

        Collection<Movie> movies = movieService.findMoviesByLength(119);
        List<Integer> moviesIds = getMoviesByIds(movies);
        assertEquals(Arrays.asList(2, 3, 4, 5, 6), getMoviesByIds(movies));

    }

    @Test
    public void return_movie_by_name() {
        Collection<Movie> movies = movieService.findByName("super");
        assertEquals(Arrays.asList(4, 8), getMoviesByIds(movies));
    }

    private static List<Integer> getMoviesByIds(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }

    @Test
    public void return_movies_by_length_and_genre() {
        Collection<Movie> movies = movieService.findMoviesByTemplate(new Movie(null, 145, Genre.ACTION));
        assertEquals(Arrays.asList(7, 8), getMoviesByIds(movies));
    }

    @Test(expected = NullPointerException.class)
    public void return_movies_by_name_and_genre() {
        Collection<Movie> movies = movieService.findMoviesByTemplate(new Movie("Superman", null, Genre.ACTION));
        assertEquals(Arrays.asList(8), getMoviesByIds(movies));

    }
}