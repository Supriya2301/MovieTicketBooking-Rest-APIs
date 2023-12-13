package com.example.MovieTicket.MovieBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieTicket.MovieBooking.Model.Movie;
import com.example.MovieTicket.MovieBooking.Service.TicketService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/ticket")
public class MovieController {
	
	@Autowired
	TicketService movieService;
	
	@GetMapping("/movies")
	public List<Movie> getMovies() {
		return movieService.getMovies();
	}

	@GetMapping("/movie/{id}")
	public Movie getMovieById(@PathVariable long id) {
		return movieService.getMovieById(id);
	}
	
	@PostMapping("/movie")
	public void addMovie(@Valid @RequestBody Movie movie, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			throw new RuntimeException("Request not valid, please validate.");
		}
		movieService.addMovie(movie);
	}
	
	@PutMapping("/update/{id}")
	public void updateMovie(@RequestBody Movie movie, @PathVariable long id) {
		movieService.updateMovie(movie, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteMovie(@PathVariable long id) {
		movieService.deleteMovie(id);
	}
	
}
