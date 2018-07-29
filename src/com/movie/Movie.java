package com.movie;

public class Movie {

	private String title;
	private String category;
	public Movie movie;
	
	public Movie(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int compareTo(Movie d) {				// use to alphabetize?
	      return (this.title).compareTo(d.title);
	   }
	
	@Override
	public String toString() {
		return "Movie title: " + title + ", category: " + category;
	}
	
	
}
