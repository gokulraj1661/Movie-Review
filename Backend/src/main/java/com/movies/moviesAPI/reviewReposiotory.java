package com.movies.moviesAPI;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reviewReposiotory extends MongoRepository<review,ObjectId>{

}
