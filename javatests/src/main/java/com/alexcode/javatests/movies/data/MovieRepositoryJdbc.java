package com.alexcode.javatests.movies.data;

import com.alexcode.javatests.movies.model.Genre;
import com.alexcode.javatests.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(Long id) {
        Object[] args = { id };
        return jdbcTemplate.queryForObject("select * from movies where id = ?", args, movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        jdbcTemplate.update("insert into movies (name, minutes, genre) values (?, ?, ?)",
                movie.getName(), movie.getMinutes(), movie.getGenre().toString());
    }

    private static RowMapper<Movie> movieMapper = (rs, rowNum) -> new Movie(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getInt("minutes"),
            Genre.valueOf(rs.getString("genre")));
}
