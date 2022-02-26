package com.rmgyantra.CRUDoperationwithputBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CompleteUpdateTheResourceTest {
    @Test
	public void completeUpdate()
	{
		JSONObject json= new JSONObject();
		json.put("createdBy", "siba");
		json.put("projectName", "TYSS2122");
		 json.put("status", "ongoing");
		 json.put("teamSize", 200);
		 
		RequestSpecification ress = RestAssured.given();
		ress.body(json);
		ress.contentType(ContentType.JSON);
		
		Response response = ress.put("http://localhost:8084/projects/TY_PROJ_3202");
		
		ValidatableResponse valid = response.then();
		valid.assertThat().contentType(ContentType.JSON);
		valid.assertThat().statusCode(200);
		valid.log().all();
		 
	}
	
	
}
