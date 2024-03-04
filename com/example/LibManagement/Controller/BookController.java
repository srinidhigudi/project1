package com.example.LibManagement.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.LibManagement.Entity.Book;
import com.example.LibManagement.Service.BookService;

public class BookController {
	@Autowired
    private BookService bookService;

    // Endpoint to fetch book details based on book ID
    @GetMapping("/{id}")
    public Book getBookDetails(@PathVariable Long id) {
        return bookService.getBookDetails(id);
    }

    // Endpoint to add a new book
    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    // Local host link for testing with Postman
    // Replace "localhost" with your actual host name or IP address
    // Replace "8080" with the actual port number of your Spring Boot application
    public static final String LOCAL_HOST_LINK = "http://localhost:8090/books";
}
