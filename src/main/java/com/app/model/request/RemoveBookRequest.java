package com.app.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RemoveBookRequest {
	public String isbn;
	public String userId;

}
