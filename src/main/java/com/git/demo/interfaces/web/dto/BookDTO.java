package com.git.demo.interfaces.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private String name;
    private String author;
    private String publisher;
    private String category;
    private String color;
    private Integer pages;
}
