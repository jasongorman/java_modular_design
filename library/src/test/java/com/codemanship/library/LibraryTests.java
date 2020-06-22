package com.codemanship.library;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LibraryTests {
	
	@Test
	public void bookAddedToLibraryIsAvailableToBorrow() throws Exception {
		Book book = new Book(null, null, 0);
		Library library = new Library();
		library.addBook(book);
		assertTrue(library .getBooks().contains(book));
	}
	
	@Test
	public void libraryDumpListsBookSummariesOnNewLines() throws Exception {
		Library library = new Library();
		library.addBook(new Book("Jaws", "Peter Benchley", 1974));
		library.addBook(new Book("Foundation", "Isaac Asimov", 1951));
		String expectedDump = "Jaws by Peter Benchley, published 1974/n" +
								"Foundation by Isaac Asimov, published 1951";
		assertEquals(expectedDump, library .dumpContents());
	}

}
