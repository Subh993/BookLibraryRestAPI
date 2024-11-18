package com.library.request;

import java.time.Instant;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookRequestDTO {

	@NotNull(message = "Title is required")
	private String title;

	@NotNull(message = "author is required")
	private String author;

	@NotNull(message = "genres is required")
	private String genres;

	@NotNull(message = "createdAt is required")
	private Instant createdAt;

}
