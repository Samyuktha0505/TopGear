package com.wipro.springtopgear.assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Movie {

	@Autowired 
	@Value("M001")
	private String movieId;
	@Autowired
	@Value("The Firm")
	private String movieName;
	@Autowired
	@Value("Tom Cruise")
	private String movieActor;
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	
	public String toString() {
		return "Movie id: "+ getMovieId()+" Movie name: "+getMovieName()+"Movie actor:  "+getMovieActor();
		
	}
	
	
}
