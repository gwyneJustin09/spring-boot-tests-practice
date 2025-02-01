package com.gwynejustin.unit_test.book;

import com.gwynejustin.unit_test.exception.BookNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImp implements BookService {
    private final BookRepo bookRepo;

    public BookServiceImp(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book getBookById(long id) {
        Optional<Book> book = bookRepo.findById(id);
        if (book.isPresent())
            return book.get();
        throw new BookNotFoundException("Book with id " + id + " not found");
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public void deleteBook(long id) {
        Optional<Book> book = bookRepo.findById(id);
        if (book.isPresent())
           bookRepo.deleteById(id);
        throw new BookNotFoundException("Book with id " + id + " not found");
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }
}
