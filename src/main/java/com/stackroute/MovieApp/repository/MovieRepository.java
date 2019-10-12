package com.stackroute.MovieApp.repository;

import com.stackroute.MovieApp.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie,Integer> {
  List<Movie> findMovieByTitle( @Param("title") String title);
}
