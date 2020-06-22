package com.codemanship.library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {

	private List<Book> books = new ArrayList<Book>();

	public List<Book> getBooks() {
		return books ;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public String dumpContents() {
		String dump = "";
		
		for (Iterator iterator = books.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			dump += book.getSummary();
			if(iterator.hasNext())
				dump += "/n";
		}
		
		return dump;
	}

}
