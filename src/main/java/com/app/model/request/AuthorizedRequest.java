package com.app.model.request;

import lombok.Data;

@Data
public class AuthorizedRequest {

	public String userName;
	public String password;
	
	 public AuthorizedRequest(String userName, String password) {
	        this.userName = userName;
	        this.password = password;
	    }

}