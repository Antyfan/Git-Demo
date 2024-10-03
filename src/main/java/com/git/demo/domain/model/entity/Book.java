package com.git.demo.domain.model.entity;

import com.git.demo.domain.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

import static com.git.demo.domain.errorcode.BookErrorCodes.BOOK_ID_NULL_OR_EMPTY;

public class Book {
    private String id;
    private String name;
    private String author;
    private String publisher;
    private String category;
    private String color;
    private Integer pages;

    public void generateBookId() {
        this.id = UUID.randomUUID().toString();
    }

    public void validateBookIdNotEmpty() {
        if(StringUtils.isEmpty(this.id)) {
            throw new BusinessException(BOOK_ID_NULL_OR_EMPTY, "Please fill in book id");
        }
    }
}
