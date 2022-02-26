package com.rmgyantra.CRUDoperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PartialUpdateOfTheResourceTest {
    @Test
	public void partialUpdate()
	{
		
    	JSONObject json = new JSONObject();
    	json.put("name", "Ravan");
    	json.put("job", "demon");
    	
    	given()
    	.body(json)
    	.contentType(ContentType.JSON)
    	
    	.when()
    	.patch("https://reqres.in/api/users/2")
    	
    	.then()
    	.assertThat().statusCode(200)
    	.assertThat().contentType(ContentType.JSON)
    	.log().all();
    	
    	
	}
	
	
}
