package com.example.MovieTicket.MovieBooking.Exceptions;

public class MovieAlreadyExistException extends RuntimeException{

	public MovieAlreadyExistException(String message) {
		super(message);
	}	
}
