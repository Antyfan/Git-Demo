package com.git.demo.infrastructure.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "book")
@Data
@Builder
@AllArgsConstructor
public class BookSql {
    @Id
    private String id;
    private String name;
    private String author;
    private String publisher;
    private String category;
    private String color;
    private Integer pages;
}
