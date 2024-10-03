package com.git.demo.interfaces.web.adapter.mapper;


import com.git.demo.domain.model.entity.Book;
import com.git.demo.interfaces.web.dto.BookDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDTO fromDomainToDto(Book book);
    List<BookDTO> fromDomainListToDtoList(List<Book> books);
    Book fromDtoToDomain(BookDTO bookDTO);
}
