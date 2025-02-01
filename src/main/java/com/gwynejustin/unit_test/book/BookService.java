package com.gwynejustin.unit_test.book;

import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(long id);
    Book saveBook(Book book);
    void deleteBook(long id);
    Book updateBook(Book book);
}
