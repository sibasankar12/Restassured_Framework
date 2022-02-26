package com.rmgyantra.CRUDoperationwithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAlltheresourceTest {
	@Test
	public void getResource()
	{
		
		when()
		.get("http://localhost:8084/projects")
		
		.then()
		.assertThat().statusCode(200)
		.and()
		.assertThat().contentType(ContentType.JSON)
		.log().all();
		
		
		
		
	}

}
