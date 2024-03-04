package com.example.LibManagement.Entity;

public class Book {

	    private Long id;
	    private String name;
	    private String author;
	    private String description;
	    private int rating;  // Constructors, getters, and setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Book(Long id, String name, String author, String description, int rating) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.description = description;
			this.rating = rating;
		}
		
	}

