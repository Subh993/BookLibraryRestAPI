package com.library.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.entity.Books;


@Repository
public interface BookLibraryRepository extends JpaRepository<Books, Long> {
	
	 Optional<Books> findBooksById(Long id);
	 
}