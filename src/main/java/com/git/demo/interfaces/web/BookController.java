package com.git.demo.interfaces.web;

import com.git.demo.interfaces.web.adapter.BookAdapter;
import com.git.demo.interfaces.web.dto.BookDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@AllArgsConstructor
public class BookController {

    private final BookAdapter bookAdapter;

    @RequestMapping(value = "/books", method = GET)
    public List<BookDTO> getBooksBy(@PathVariable("category") String category) {
        return bookAdapter.getAllBooksBy(category);
    }
}
