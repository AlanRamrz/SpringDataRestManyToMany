package com.manymany.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manymany.data.Author;
import com.manymany.data.Book;
import com.manymany.repos.AuthorRepository;
import com.manymany.repos.BookRepository;

@RestController
@RequestMapping("/utils")
public class Utils {
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;

	@GetMapping(value = "/newBook")
	public String hello() {
		Book newBook = new Book();
		newBook.setTitle("Bloc");
		newBook = bookRepository.save(newBook);
		
		Author author = authorRepository.getOne(1);
		author.getBooks().add(newBook);
		authorRepository.save(author);
		
		return "New Book added";
	}
}
