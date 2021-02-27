package com.example.bookstore.crudRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.bookstore.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}