package com.app.service;

import com.app.dao.BookDao;
import com.app.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }
}
