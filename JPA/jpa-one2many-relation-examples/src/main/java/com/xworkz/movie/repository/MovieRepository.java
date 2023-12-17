package com.xworkz.movie.repository;

import com.xworkz.movie.dto.ActorsDto;
import com.xworkz.movie.dto.MovieDto;

public interface MovieRepository {
    void addMovie(MovieDto dto);
    MovieDto getMovieById(int id);
    ActorsDto getActorById(int id);
}
