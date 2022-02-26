package com.rmgyantra.CRUDoperationwithputBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteTheResourceTest {
	@Test
	public void delete()
	{
		Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_3202");
		
		ValidatableResponse valid = response.then();
		
		valid.assertThat().statusCode(204);
		valid.log().all();
	}

}
