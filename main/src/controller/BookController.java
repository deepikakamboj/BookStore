package controller;

import model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.BookService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

  BookService service;

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<List<Book>> getBooks(){
    List<Book> books = service.getBooks();
    return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
  }
}
