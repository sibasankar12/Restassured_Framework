package com.rmgyantra.waysToPostARequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateObjectByJsonObjectTest {
	 @Test
	public void createResource()
	{
		 JSONObject json = new JSONObject();
		 json.put("createdBy", "sibasn");
		 json.put("projectName", "TYSS_024");
		 json.put("status", "ongoing");
		 json.put("teamSize", 200);
		 
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
