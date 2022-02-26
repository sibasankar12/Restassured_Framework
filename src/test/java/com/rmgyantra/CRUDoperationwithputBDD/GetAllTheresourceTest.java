package com.rmgyantra.CRUDoperationwithputBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllTheresourceTest {
	
	@Test
	public void getResource()
	{
		Response response = RestAssured.get("http://localhost:8084/projects");
		
		System.out.println(response.getContentType());
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody());
		
		
		ValidatableResponse validate = response.then();
		validate.log().all();
		
	}

}
