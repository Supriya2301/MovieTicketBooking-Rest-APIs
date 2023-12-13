package com.example.MovieTicket.MovieBooking.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.MovieTicket.MovieBooking.Exceptions.MovieAlreadyExistException;
import com.example.MovieTicket.MovieBooking.Exceptions.MovieNotFoundException;
import com.example.MovieTicket.MovieBooking.Model.Movie;

@Service
public class MovieService implements TicketService {
	
	private List<Movie> movieList = new ArrayList<>();
	private Map<Long, Movie> movieMap = new HashMap<>();

	@Override
	public List<Movie> getMovies() {
		return movieList;
	}

	@Override
	public Movie getMovieById(long id) {
		if(ObjectUtils.isEmpty(movieMap.get(id)))
		{
			throw new MovieNotFoundException("Movie not found!");
		}
		
		return movieMap.get(id);
	}

	@Override
	public void addMovie(Movie movie) {
		if(movieMap.containsKey(movie.getId())) {
			throw new MovieAlreadyExistException("Movie already exists with id: "+movie.getId());
		}
		movieList.add(movie);
		movieMap.put(movie.getId(), movie);
	}
	

	@Override
	public void updateMovie(Movie movie, long id) {
		Movie existingMovie = getMovieById(id);
		movieList.remove(existingMovie);
		movieList.add(movie);
		movieMap.put(id, movie);
	}

	@Override
	public void deleteMovie(long id) {
		movieList.remove(getMovieById(id));
		movieMap.remove(id);	
	}
}
