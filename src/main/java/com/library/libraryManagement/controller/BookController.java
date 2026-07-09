package com.library.libraryManagement.controller;

import com.library.libraryManagement.entity.Book;
import com.library.libraryManagement.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService service;
    public  BookController(BookService service){
        this.service=service;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return service.addbook(book);
    }
    @GetMapping
    public List<Book> getBooks(){
        return service.allBooks();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return service.bookById(id);
  }
        @DeleteMapping("/{id}")
        public String deleteBook(@PathVariable Long id){
            return  service.deleteBook(id);
        }
    @GetMapping("/author/{author}")
    public List<Book> getBooksByAuthor(@PathVariable String author) {
        return service.byAuthor(author);
    }

    // Get books by category
    @GetMapping("/category/{category}")
    public List<Book> getBooksByCategory(@PathVariable String category) {
        return service.byCategory(category);
    }

    // Get books cheaper than given price
    @GetMapping("/price/{price}")
    public List<Book> getBooksByPrice(@PathVariable double price) {
        return service.priceLessThan(price);
    }

    // Get available books
    @GetMapping("/available")
    public List<Book> getAvailableBooks() {
        return service.availableCopiesGreaterThan();
    }
    }


