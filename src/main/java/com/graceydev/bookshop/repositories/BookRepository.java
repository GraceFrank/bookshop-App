package com.graceydev.bookshop.repositories;

import com.graceydev.bookshop.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

