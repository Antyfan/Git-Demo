package com.git.demo.infrastructure.database.adapter;

import com.git.demo.domain.model.entity.Book;
import com.git.demo.domain.repository.BookRepository;
import com.git.demo.infrastructure.database.adapter.mapper.BookSqlMapper;
import com.git.demo.infrastructure.database.entity.BookSql;
import com.git.demo.infrastructure.database.repository.BookJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BookRepositoryImpl implements BookRepository {

    private final BookJpaRepository bookJpaRepository;
    private final BookSqlMapper bookSqlMapper;

    @Override
    public List<Book> getBooksBy(String category) {
        List<BookSql> booksByCategory = bookJpaRepository.findBookByCategory(category);
        return bookSqlMapper.fromSqlListToDomainList(booksByCategory);
    }

    @Override
    public Book findBookBy(String bookId) {
        BookSql bookSql = bookJpaRepository.findById(bookId).get();
        return bookSqlMapper.fromSqlToDomain(bookSql);
    }


    @Override
    public Book updateBook(Book book) {
        BookSql savedBook = bookJpaRepository.save(bookSqlMapper.fromDomainToSql(book));
        return bookSqlMapper.fromSqlToDomain(savedBook);
    }
}
