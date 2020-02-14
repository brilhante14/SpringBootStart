package com.example.demo.persistence.model;

import java.util.ArrayList;
import java.util.List;

public class BookBusiness {
	public List<Book> getBookList() {
		List<Book> listBook = new ArrayList<>();
		
		listBook.add(new Book("Lord of the Rings", "Tolkien"));
		listBook.add(new Book("It", "King, Stephen"));
		listBook.add(new Book("American Gods", "Neil Gaiman"));

		return listBook;

	}
}
