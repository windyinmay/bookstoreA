package com.example.bookstore;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.crudRepository.BookRepository;
import com.example.bookstore.crudRepository.CategoryRepository;
import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.Category;



@SpringBootApplication
public class BookstoreApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner addBookDemo(BookRepository repository) {
		return (args) -> {
			repository.save(new Book("Emest Hemingway", "A Farewell to Arms","1929", "1232323-21", 0));
			repository.save(new Book("George Orwell", "Animal Farm", "1945", "2212343-5", 0));
		};

	}
	@Bean
	public CommandLineRunner addCategoryDemo(CategoryRepository catRepository) {
		return (args) -> {
			catRepository.save(new Category("Matias"));
			catRepository.save(new Category("Ngoc Anh"));
		};
	}
}
