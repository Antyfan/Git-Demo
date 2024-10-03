package com.git.demo.application.impl;

import com.git.demo.application.BookService;
import com.git.demo.domain.model.entity.Book;
import com.git.demo.domain.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getBooksBy(String category) {
        return bookRepository.getBooksBy(category);
    }
}
