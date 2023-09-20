package com.movies.moviesAPI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/movies")
@CrossOrigin("http://localhost:3000/")
public class movieControler {
	@Autowired
	private movieService MovieService;
	
	@GetMapping
	public ResponseEntity<List<movie>> getallMovies(){
		return new ResponseEntity<List<movie>>(MovieService.allMovies(),HttpStatus.OK);
	}
	
	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<movie>> getsinglemovie(@PathVariable String imdbId){
		return new ResponseEntity<Optional<movie>>(MovieService.singlrmovie(imdbId),HttpStatus.OK);
	}
	
}
