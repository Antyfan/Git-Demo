package com.git.demo.interfaces.web.adapter;

import com.git.demo.interfaces.web.dto.BookDTO;

import java.util.List;

public interface BookAdapter {
    List<BookDTO> getAllBooksBy(String category);
}
