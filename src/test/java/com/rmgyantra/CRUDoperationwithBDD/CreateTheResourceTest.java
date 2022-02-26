package com.rmgyantra.CRUDoperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateTheResourceTest {
	@Test
	public void create()
	{
		JSONObject json=new JSONObject();
		json.put("createdBy", "sibasankar");
		json.put("projectName", "TYSS_0112");
		json.put("status", "ongoing");
		json.put("teamSize", 102 );
		
		given()
		.body(json)
		.contentType(ContentType.JSON)
		
		.when()
		.post("http://localhost:8084/addProject")
	    
		.then()
	     .assertThat().contentType(ContentType.JSON)
	     .assertThat().statusCode(201)
	     .log().all();
		
		
	}

}
