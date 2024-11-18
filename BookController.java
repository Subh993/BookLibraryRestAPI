package com.library.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.Books;
import com.library.request.BookRequestDTO;
import com.library.service.BookService;

@RestController
@RequestMapping("/api/library")
@Validated
public class BookController {
	
	@Autowired
	private BookService bookService;

	@PostMapping("/books")  
	private ResponseEntity<Books> saveBook(@RequestBody BookRequestDTO books)   
	{  
		Books bookRequestObj = new Books();
		bookRequestObj.setTitle(books.getTitle());
		bookRequestObj.setAuthor(books.getAuthor());
		bookRequestObj.setGenres(books.getGenres());
		
		bookService.saveOrUpdate(bookRequestObj);
		return new ResponseEntity<Books>(HttpStatus.CREATED);  
	}  
	
	 @GetMapping("/books")
	 public ResponseEntity<List<Books>> getAllListofBooks()
	 {
		 List<Books> list = bookService.getAllListofBooks();
		 return new ResponseEntity<List<Books>>(list , HttpStatus.OK);
	 }
	 
	 
	 @GetMapping("/books/{bookid}")  
	 private  ResponseEntity<Books> getBooks(@PathVariable("bookid") Long bookid)   
	 {  
		  
		  Books books = bookService.getBooksById(bookid);  
		  return new ResponseEntity<Books>(books , HttpStatus.OK);
	 } 
	 
	 @GetMapping("/genres/{bookid}")  
	 private  String getGenres(@PathVariable("bookid") Long bookid)   
	 {  
		  Books books = bookService.getBooksById(bookid); 
		  String genres = books.getGenres();
		  return genres;
	 } 
	 

}
