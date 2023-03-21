package com.app.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class UserAccountResponse {

	public String code;
	public String message;

	public UserAccountResponse(String code, String message) {
		this.message = message;
		this.code = code;

	}
}
