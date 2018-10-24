package com.manymany.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manymany.data.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

	
}