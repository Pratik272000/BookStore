package com.app.controller;
import com.app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
@Autowired
    BookService bookService;
@GetMapping("/get")
    public ResponseEntity<?> getAllBooks(){
    return ResponseEntity.ok(bookService.getAllBooks());
}

@GetMapping("/isbn/{isbn}")
    public ResponseEntity<?> getBookByIsbn(@PathVariable String isbn){
    return ResponseEntity.ok(bookService.getBookByIsbn(isbn));
}

}
