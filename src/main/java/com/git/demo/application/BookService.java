package com.git.demo.application;

import com.git.demo.domain.model.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooksBy(String category);
    Book updateBook(String bookId, String category);
}
