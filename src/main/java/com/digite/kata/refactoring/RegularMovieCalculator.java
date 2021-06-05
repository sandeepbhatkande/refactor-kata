package com.digite.kata.refactoring;

public class RegularMovieCalculator implements MovieCalculator {

	private Movie w_movie;
	static final int frequencyIncrement = 0;
	public RegularMovieCalculator(Movie a_movie) {
		this.w_movie = a_movie;
	}
	
	public Movie getMovie() {
		return w_movie;
	}
	
	
	public int getFrequencyIncrement() {
		return frequencyIncrement;
	}
	
	public double amountCalculator(int a_daysRented)
	{
		double thisAmount = 2;
		if (a_daysRented > 2)
            thisAmount += (a_daysRented - 2) * 1.5;
		return thisAmount;
	}
	
}