package com.graceydev.bookshop.controllers;

import com.graceydev.bookshop.models.Book;
import com.graceydev.bookshop.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

}
