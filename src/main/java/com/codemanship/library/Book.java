package com.codemanship.library;

public class Book {

	private final String title;
	private final String author;
	private final int yearPublished;
	private float totalRating = 0;
	private int ratingsCount = 0;

	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
	}

	public String getSummary() {
		return title + " by " + author + ", published " 
				+ Integer.toString(yearPublished);
	}

	public void rate(int scoreOutOfFive) {
		ratingsCount++;
		totalRating += scoreOutOfFive;
	}

	public int getRating() {
		return Math.round(totalRating/ratingsCount);
	}

}
