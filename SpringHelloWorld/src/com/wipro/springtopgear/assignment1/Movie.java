package com.wipro.springtopgear.assignment1;

public class Movie {

	/* movieId – String – E.g.: M001
movieName – String – E.g.: The Firm
 movieActor – String – E.g.: Tom Cruise*/
	private String movieId;
	private String movieName;
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
