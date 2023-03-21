package com.app.validation;

import org.apache.http.HttpStatus;
import org.junit.Assert;

import com.app.model.response.UserAccountResponse;


public class Account_Validation {
	public HttpStatus httpStatusCode;

	public void verifyStatusCode(int actualStatusCode) {
		int expectedStatusCode = HttpStatus.SC_OK;
		Assert.assertEquals(expectedStatusCode, actualStatusCode);
	}
	
	public void verifyAuthorizedUserRespose(String actualValue) {
		Assert.assertTrue("Authorised Response value is ", Boolean.parseBoolean(actualValue));
	}
	
	public void verifyAccountUserCode() {
		UserAccountResponse addUserAccountResponeModal= new UserAccountResponse();
		String code = addUserAccountResponeModal.getCode();
		Assert.assertNotNull(code, "");
	}
	
	public void verifyAccountUserMessage() {
		UserAccountResponse addUserAccountResponeModal= new UserAccountResponse();
		String message = addUserAccountResponeModal.getMessage();
		Assert.assertNotNull(message, "");
	}
}
