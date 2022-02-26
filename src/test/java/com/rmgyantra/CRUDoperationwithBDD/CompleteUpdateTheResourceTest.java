package com.rmgyantra.CRUDoperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CompleteUpdateTheResourceTest {
    @Test
	public void completeUpdate()
	{
		 JSONObject json=new JSONObject();
		 json.put("createdBy", "sibasankars");
		 json.put("projectName", "TYSS_0112");
		 json.put("status", "completed");
		 json.put("teamSize", 200);
		 
		 given()
		 .body(json)
		 .contentType(ContentType.JSON)
		 
		 .when()
		 .put("http://localhost:8084/projects/TY_PROJ_2403")
		  
		 .then()
		 .assertThat().contentType(ContentType.JSON)
		 .assertThat().statusCode(200)
		 .log().all();
		 
    	
    	
	}
	
}
