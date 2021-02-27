package com.example.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

	@Entity
	public class Book {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long bookId;
		
		@ManyToOne
		@JoinColumn(name = "categoryId")
		private Category category;
		private String title;
		private String author;
		private String isbn;
		private String year;
		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		private double price;
		

		public Book(String title, String author, String year, String isbn, double price) {
			super();
			this.title = title;
			this.author = author;
			this.isbn = isbn;
			this.year = year;
			this.price = price;
		}

		public Long getBookId() {
			return bookId;
		}

		public void setBookId(Long bookId) {
			this.bookId = bookId;
		}

		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", year=" + year + ", price="
					+ price + "]";
		}

	}
