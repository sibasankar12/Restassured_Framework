package com.rmgyantra.CRUDoperationwithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteTheResourceTest {
	@Test
	public void deleteTheResource()
	{
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_2402")
		
	    .then()
	    .assertThat().contentType(ContentType.JSON)
	     .assertThat().statusCode(204)
	    .log().all();
		
		
	}

}
