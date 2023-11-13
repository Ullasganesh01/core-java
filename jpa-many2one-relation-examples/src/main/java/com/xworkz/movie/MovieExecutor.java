package com.xworkz.movie;

import com.xworkz.movie.dto.ActorsDto;
import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.repository.MovieRepository;
import com.xworkz.movie.repository.impl.MovieRepositoryImpl;
import com.xworkz.movie.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class MovieExecutor {
    public static void main(String[] args) {
        MovieRepository movieRepository = new MovieRepositoryImpl();
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        ActorsDto actorsDto = new ActorsDto();
        actorsDto.setActorName("Yash");
        actorsDto.setGender("Male");
        actorsDto.setEarnings(50000000);

        ActorsDto actorsDto1 = new ActorsDto();
        actorsDto1.setActorName("Sanjay Dutt");
        actorsDto1.setGender("Male");
        actorsDto1.setEarnings(10000000);



        MovieDto movieDto = new MovieDto();
        movieDto.setMovieName("KGF");
        movieDto.setLanguage("Kannada");

        actorsDto.setMovie(movieDto);
        actorsDto1.setMovie(movieDto);

        List<ActorsDto> actorsList = new ArrayList<>();
        actorsList.add(actorsDto);
        actorsList.add(actorsDto1);
        movieDto.setActors(actorsList);

        movieRepository.addMovie(movieDto);
    }
}
