package com.app.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestResponseConfiguration {
	Response response = null;

	public RequestSpecification getBaseUrl() {
		return RestAssured.given().baseUri(Constant.URL).log().all();
	}

	public Response getResponse(RequestSpecification requestSpecification, String endpoint, String methodName)
			throws Exception {
		switch (methodName) {
		case "GET": {
			response = requestSpecification.get(endpoint);
			break;
		}
		case "POST": {
			response = requestSpecification.post(endpoint);
			break;
		}
		case "PUT": {
			response = requestSpecification.put(endpoint);
			break;
		}
		case "PATCH": {
			response = requestSpecification.patch(endpoint);
			break;
		}
		case "DELETE": {
			response = requestSpecification.delete(endpoint);
			break;
		}
		default:
			throw new Exception("Invalid Method " + methodName);

		}
		return response.andReturn();
	}

	public Response getResponse(RequestSpecification requestSpecification, String endpoint, String methodName,
			String pathParam) throws Exception {
		Response response = null;
		switch (methodName) {
		case "GET": {
			response = requestSpecification.get(endpoint, pathParam);
			break;
		}
		case "POST": {
			response = requestSpecification.post(endpoint, pathParam);
			break;
		}
		case "PUT": {
			response = requestSpecification.put(endpoint, pathParam);
			break;
		}
		case "PATCH": {
			response = requestSpecification.patch(endpoint, pathParam);
			break;
		}
		case "DELETE": {
			response = requestSpecification.delete(endpoint, pathParam);
			break;
		}
		default:
			throw new Exception("Invalid Method " + methodName);

		}
		return (Response) response.then().log().all();
	}

}
