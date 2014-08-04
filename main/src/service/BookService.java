package service;

import model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
public class BookService {
  public List<Book> getBooks() {
    Book bookOne = new Book(1, "one");
    Book bookTwo = new Book(2, "two");
    return asList(bookOne, bookTwo);

  }
}
