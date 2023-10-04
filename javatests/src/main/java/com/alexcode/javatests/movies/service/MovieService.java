package com.alexcode.javatests.movies.service;

import com.alexcode.javatests.movies.data.MovieRepository;
import com.alexcode.javatests.movies.model.Genre;
import com.alexcode.javatests.movies.model.Movie;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
      return movieRepository.findAll().stream()
              .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByLength(int length) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= length).collect(Collectors.toList());
    }

    public Collection<Movie> findByName(String name) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getName().toLowerCase().contains(name)).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByTemplate(Movie template) {

        if (template.getMinutes() <= 0 || template.getMinutes() == null) {
            throw new NullPointerException("Movie time must be geater than 0 minutes");
        }

        Collection<Movie> filteredMovies = movieRepository.findAll().stream().filter(movie -> {
        if (template.getMinutes() != null && movie.getMinutes() > template.getMinutes()) {
            return false;
        }
        if (template.getName() != null && !movie.getName().equals(template.getName())) {
            return false;
        }
        if (template.getGenre() != null && !movie.getGenre().equals(template.getGenre())) {
            return false;
        }
        return true;
    }).collect(Collectors.toList());
    return filteredMovies;
    }
}
