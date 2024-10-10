package com.git.demo.interfaces.web.adapter.impl;

import com.git.demo.application.BookService;
import com.git.demo.domain.model.entity.Book;
import com.git.demo.interfaces.web.adapter.BookAdapter;
import com.git.demo.interfaces.web.adapter.mapper.BookMapper;
import com.git.demo.interfaces.web.dto.BookDTO;
import com.git.demo.interfaces.web.dto.UpdateBootDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BookAdapterImpl implements BookAdapter {

    private final BookService bookService;
    private final BookMapper bookMapper;

    @Override
    public List<BookDTO> getAllBooksBy(String category) {
        List<Book> books = bookService.getBooksBy(category);
        return bookMapper.fromDomainListToDtoList(books);
    }

    @Override
    public BookDTO updateBook(String bookId, UpdateBootDTO updateBootDTO) {
        return bookMapper.fromDomainToDto(bookService.updateBook(bookId, updateBootDTO.getCategory()));
    }
}
