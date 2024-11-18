package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Books;
import com.library.repository.BookLibraryRepository;

@Service
public class BookService {
	
	@Autowired
	private BookLibraryRepository bookLibraryRepository;
	
	public List<Books> getAllListofBooks()
	{
	    List<Books> books = bookLibraryRepository.findAll();
		return books;
	}
	 
	public void saveOrUpdate(Books books)
	{
		 bookLibraryRepository.save(books);
	}
	
	public Books getBooksById(Long bookId)   
	{  
	return bookLibraryRepository.findBooksById(bookId).get();  
	}  
	 

}
