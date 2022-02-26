package com.rmgyantra.CRUDoperationwithputBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateAllResourceTest {
	@Test
	public void create()
	{

	JSONObject json=new JSONObject();
	
	 json.put("createdBy", "siba");
	 json.put("projectName", "TYSS21");
	 json.put("status", "completed");
	 json.put("teamSize", 200);
	 
	 RequestSpecification ressass = RestAssured.given();
	  ressass.contentType(ContentType.JSON);
	  ressass.body(json);
	  
	  Response response = ressass.post("http://localhost:8084/addProject");
	  ValidatableResponse validate = response.then();
	  validate.assertThat().contentType(ContentType.JSON);
	  validate.assertThat().statusCode(201);
	  validate.log().all();
	
}
}
