package com.git.demo.interfaces.web.adapter;

import com.git.demo.interfaces.web.dto.BookDTO;
import com.git.demo.interfaces.web.dto.UpdateBootDTO;

import java.util.List;

public interface BookAdapter {
    List<BookDTO> getAllBooksBy(String category);
    BookDTO updateBook(String bookId, UpdateBootDTO updateBootDTO);
}
