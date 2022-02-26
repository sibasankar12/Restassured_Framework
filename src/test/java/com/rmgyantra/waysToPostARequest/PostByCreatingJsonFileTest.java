package com.rmgyantra.waysToPostARequest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostByCreatingJsonFileTest {
	@Test
	public void creatingByFile()
	{
		File fil=new File("src/main/resources/Avengers.json");
		
		given()
		.contentType(ContentType.JSON)
		.body(fil)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(201)
		.log().all();
		
		
	}

}
