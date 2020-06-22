package com.codemanship.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class BookStatsTests {
	
	@Test
	public void twoBooksRatedFiveFoundInListOfThreeBooks() throws Exception {
		List<Book> books = new ArrayList<Book>();
		addBookWithRating(books, 5);
		addBookWithRating(books, 5);
		addBookWithRating(books, 1);
		
		assertEquals(2, new BookStats(books).getBooksWithRating(5).size());
	}

	private void addBookWithRating(List<Book> books, int rating) {
		Book book1 = new Book(null, null, 0);
		book1.rate(rating);		
		books.add(book1);
	}

}
