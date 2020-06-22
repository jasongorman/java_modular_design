package com.codemanship.library;

import java.util.ArrayList;
import java.util.List;

public class BookStats {

	private final List<Book> books;

	public BookStats(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooksWithRating(int rating) {
		List<Book> booksWithRating = new ArrayList<Book>();
		for (Book book : books) {
			if(book.getRating() == rating)
				booksWithRating.add(book);
		}
		return booksWithRating;
	}

}

