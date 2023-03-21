package com.app.model.response;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class BookResponse {
	
	    public String isbn;
	    public String title;
	    public String subTitle;
	    public String author;
	    public String publish_date;
	    public String publisher;
	    public int pages;
	    public String description;
	    public String website;

}
