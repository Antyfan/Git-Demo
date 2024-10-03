package com.git.demo.infrastructure.database.adapter.mapper;

import com.git.demo.domain.model.entity.Book;
import com.git.demo.infrastructure.database.entity.BookSql;
import com.git.demo.interfaces.web.dto.BookDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookSqlMapper {
    BookSql fromDomainToSql(Book book);
    List<BookSql> fromDomainListToSqlList(List<Book> books);
    Book fromSqlToDomain(BookSql bookDTO);
    List<Book> fromSqlListToDomainList(List<BookSql> bookSqls);
}
