package com.dojo.jdbchistory.domain.book.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dojo.jdbchistory.domain.book.entity.Book;

public interface IBookJpaRepository extends JpaRepository<Book, Long> {

	List<Book> findByTitleLike(String title);

}
