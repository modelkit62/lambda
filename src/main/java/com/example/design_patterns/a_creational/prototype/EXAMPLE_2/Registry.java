package com.example.design_patterns.a_creational.prototype.EXAMPLE_2;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<Type, Item> cojones = new HashMap<Type, Item>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem (Type type) {
		Item item = null;
		
		try {
			item = (Item)(cojones.get(type)).clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}

	public enum Type{
		MOVIE, BOOK
	}

	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Basic Movie");
		movie.setPrice(24.99);
		movie.setRuntime("2 hours");
		cojones.put(Type.MOVIE, movie);
		
		Book book = new Book();
		book.setNumberOfPages(335);
		book.setPrice(19.99);
		book.setTitle("Basic Book");
		cojones.put(Type.BOOK, book);
	}
}
