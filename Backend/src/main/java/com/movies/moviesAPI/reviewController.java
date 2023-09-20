package com.movies.moviesAPI;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/reviews")
public class reviewController {
	@Autowired
	private reviewService ReviewService;
	
	@PostMapping
	public ResponseEntity<review> createReview(@RequestBody Map<String,String> payload){
		return new ResponseEntity<review>(ReviewService.createReview(payload.get("reviewBody"),payload.get("imdbId")),HttpStatus.CREATED);
	}

}
