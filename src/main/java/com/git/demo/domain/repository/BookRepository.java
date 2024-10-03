package com.git.demo.domain.repository;

import com.git.demo.domain.model.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getBooksBy(String category);
}
