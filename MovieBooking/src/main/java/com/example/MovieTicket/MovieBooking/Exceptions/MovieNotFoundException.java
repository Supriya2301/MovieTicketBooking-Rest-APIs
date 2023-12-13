package com.example.MovieTicket.MovieBooking.Exceptions;

public class MovieNotFoundException extends RuntimeException{

	public MovieNotFoundException(String message) {
		super(message);
	}

}
