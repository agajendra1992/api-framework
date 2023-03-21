package com.app.model.response;

import java.util.ArrayList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BooksResponse {

	 public ArrayList<BookResponse> books;
	 
	 public BooksResponse (ArrayList<BookResponse> books) {
		 this.books = books;
	 }
}
