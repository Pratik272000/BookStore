package com.app.service;

import com.app.dao.BookDao;
import com.app.entities.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {
@Mock
    BookDao bookDao;
@InjectMocks
    BookService bookService;
@Test
    public void getAllBooks_Test(){
    Book b1 = new Book(1, "Game of throne", "1234");
    Book b2 = new Book(2, "Percy Jackson", "1234");
    when(bookDao.findAll()).thenReturn(new ArrayList<>(Arrays.asList(b1,b2)));
    List<Book> result=bookService.getAllBooks();
    assertEquals(2,result.size());
    assertEquals(b1.getName(),result.get(0).getName());

}



}