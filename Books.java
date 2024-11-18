package com.library.entity;

import java.time.Instant;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ColumnDefault;



@Entity
@Table(name = "books")
public class Books {
 
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "library_id_gen")
    @SequenceGenerator(name = "library_id_gen", sequenceName = "library_id_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    
	@Size(max = 200)
    @NotNull
    @Column(name = "title", nullable = false, length = 200)
    private String title;
    
	@Size(max = 500)
    @NotNull
    @Column(name = "author", nullable = false, length = 500)
    private String author;
	
	@Size(max = 500)
    @NotNull
    @Column(name = "genre", nullable = false, length = 500)
	private String genres;
   
	@NotNull
    @ColumnDefault("now()")
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

	//setters and getters
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	
	
}
