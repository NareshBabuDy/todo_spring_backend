package com.naresh.spring.controller;

import com.naresh.spring.model.Book;
import com.naresh.spring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/book/all")
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
