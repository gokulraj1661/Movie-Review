package com.movies.moviesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class reviewService{
	
	@Autowired
	private reviewReposiotory ReviewRepository;
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public review createReview(String reviewBody,String imdbId) {
		review Review = new review(reviewBody);
		ReviewRepository.insert(Review);
		
		mongoTemplate.update(movie.class).matching(Criteria.where("imdbId").is(imdbId))
		.apply(new Update().push("reviewBody").value(Review)).first();
		
		return Review;
	}

}
