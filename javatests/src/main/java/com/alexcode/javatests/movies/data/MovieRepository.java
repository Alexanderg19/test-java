package com.alexcode.javatests.movies.data;

import com.alexcode.javatests.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {
    Movie findById(Long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);

}
