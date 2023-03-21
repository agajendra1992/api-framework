package com.app.model.request;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BookRequest {

	public String userId;
	public List<ISBNRequest> collectionOfIsbns;
	
	
	public BookRequest(String userId, ISBNRequest isbn){
        this.userId = userId;
        collectionOfIsbns = new ArrayList<ISBNRequest>();
        collectionOfIsbns.add(isbn);
    }
}
