package com.example.bootstrapspringboot.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.bootstrapspringboot.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}