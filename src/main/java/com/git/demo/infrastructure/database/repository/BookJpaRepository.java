package com.git.demo.infrastructure.database.repository;

import com.git.demo.infrastructure.database.entity.BookSql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookJpaRepository extends JpaRepository<BookSql, String> {
    List<BookSql> findBookByCategory(String category);
}
