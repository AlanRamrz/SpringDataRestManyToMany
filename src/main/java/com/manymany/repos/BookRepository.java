package com.manymany.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manymany.data.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	
	
}