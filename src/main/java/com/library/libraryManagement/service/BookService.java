package com.library.libraryManagement.service;

import com.library.libraryManagement.entity.Book;
import com.library.libraryManagement.repository.BookRepository;
import org.springframework.stereotype.Service;
//import com.library.libraryManagement.
import java.util.List;

@Service
public class BookService
{
    private final BookRepository repository;
    public BookService(BookRepository repository){
        this.repository=repository;
    }
    public Book addbook(Book book){
        return repository.save(book);
    }
    public List<Book> allBooks(){
return repository.findAll();
    }
    public Book bookById(Long id){
        return repository.findById(id);
    }
    public String deleteBook(Long id){
        Book book=repository.findById(id);
        repository.delete(book);
        return "";
    }
    public List<Book>byAuthor(String author){
        return repository.byAuthor(author);
    }
    public List<Book>byCategory(String category){
        return repository.byCategory(category);
    }
    public List<Book>priceLessThan(double price){
        return repository.priceLessThan(price);
    }
    public List<Book>availableCopiesGreaterThan(){
        return repository.availableCopiesGreaterThanZero(0);
    }
}
