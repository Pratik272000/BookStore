package com.app.dao;

import com.app.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
    Book findByIsbn(String isbn);
}
