package com.example.MovieTicket.MovieBooking.Service;

import java.util.List;

import com.example.MovieTicket.MovieBooking.Model.Movie;

public interface TicketService {
	
	public List<Movie> getMovies();
	public Movie getMovieById(long id);
	public void addMovie(Movie movie);
	public void updateMovie(Movie movie, long id);
	public void deleteMovie(long id);

}
