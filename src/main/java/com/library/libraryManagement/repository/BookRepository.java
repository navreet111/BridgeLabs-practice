package com.library.libraryManagement.repository;

import com.library.libraryManagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository <Book,Integer>{
    List<Book> byAuthor(String author);
    List<Book> byCategory(String category);
    List<Book> priceLessThan(double price);
    List<Book> availableCopiesGreaterThanZero(int available_copies);


   Book findById(Long id);
}
