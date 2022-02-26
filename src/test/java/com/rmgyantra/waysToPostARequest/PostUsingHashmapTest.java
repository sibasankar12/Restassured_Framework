package com.rmgyantra.waysToPostARequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class PostUsingHashmapTest {
	@Test
	public void postByHashMap()
	{
     HashMap map =new HashMap();
	 map.put("createdBy", "sibun");
	 map.put("projectName", "TYSS_025");
	 map.put("status", "completed");
	 map.put("teamSize", 250);
	 
	 given()
	 .body(map)
	 .contentType(ContentType.JSON)
	  
	 .when()
	 .post("http://localhost:8084/addProject")
	 
	 .then()
	  .assertThat().contentType(ContentType.JSON)
	  .assertThat().statusCode(201)
	  .log().all();
	}
	

}
