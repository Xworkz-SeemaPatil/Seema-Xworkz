package com.xworkz.solution.dto;

public class MovieDTO {
	private String name;
	private double rating;
	private double duration;
	private String genre;
	public MovieDTO(String name, double rating, double duration, String genre) {
		super();
		this.name = name;
		this.rating = rating;
		this.duration = duration;
		this.genre = genre;
	}
	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", rating=" + rating + ", duration=" + duration + ", genre=" + genre + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
