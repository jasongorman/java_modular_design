package com.codemanship.library;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTests {

	@Test
	public void bookSummaryHasTitleAuthorAndYearPublished() throws Exception {
		Book book = new Book("Watership Down", "Richard Adams", 1972);
		assertEquals("Watership Down by Richard Adams, published 1972",
				book.getSummary());
	}
	
	@Test
	public void bookRatingIsAverageOfUserRatings() throws Exception {
		Book book = new Book(null, null, 0);
		book.rate(3);
		book.rate(5);
		assertEquals(4, book .getRating());
	}
}
