package com.rmgyantra.waysToPostARequest;

import org.testng.annotations.Test;

import com.rmgyantra.pojolib.PojoLib;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostByUsingPojoClassTest {
	@Test
	public void byUsingPojoClass()
	{
		PojoLib plib=new PojoLib("sankars","TYSS_0548","completed", 200);
		
		given()
		.contentType(ContentType.JSON)
		.body(plib)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(201)
		.log().all();
		
		
	}

}
