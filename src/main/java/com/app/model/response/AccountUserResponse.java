package com.app.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class AccountUserResponse {

	public String token;
	public String expires;
	public String status;
	public String result;

	public AccountUserResponse(String token, String expires, String status, String result) {
		this.token = token;
		this.expires = expires;
		this.status = status;
		this.result = result;
	}
}
