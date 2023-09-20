package com.movies.moviesAPI;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface movieRepository extends MongoRepository<movie,ObjectId>{
	Optional<movie> findMovieByImdbId(String imdbId);
}
