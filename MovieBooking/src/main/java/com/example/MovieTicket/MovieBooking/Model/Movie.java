package com.example.MovieTicket.MovieBooking.Model;

import java.util.List;

import jakarta.annotation.Nonnull;


public class Movie {
	
	@Min(value=1)
	long id;
	@Size(min=3,max=20)
	String movieName;
	@Nonnull
	String movieDirector;
	long movieRating;
	String language;
	List<String> writers;
	List<String> actors;
	List<String> genres;
	

	public Movie(long id, String movieName, String movieDirector, long movieRating, String language,
			List<String> writers, List<String> actors, List<String> genres) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieRating = movieRating;
		this.language = language;
		this.writers = writers;
		this.actors = actors;
		this.genres = genres;
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", movieDirector=" + movieDirector + ", movieRating="
				+ movieRating + ", language=" + language + ", writers=" + writers + ", actors=" + actors + ", genres="
				+ genres + "]";
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public long getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(long movieRating) {
		this.movieRating = movieRating;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public List<String> getWriters() {
		return writers;
	}
	public void setWriters(List<String> writers) {
		this.writers = writers;
	}
	public List<String> getActors() {
		return actors;
	}
	public void setActors(List<String> actors) {
		this.actors = actors;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	
}
