package com.rmgyantra.CRUDoperationwithputBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PartialUpdationTest {
     @Test
	public void updataion()
	{
	 JSONObject json=new JSONObject();
	 json.put("name", "siba");
	 json.put("job", "student");
	 
	 
	 RequestSpecification ress = RestAssured.given();
	 ress.body(json);
	 ress.contentType(ContentType.JSON);
	 
	 Response response = ress.patch("https://reqres.in/api/users/2");
	 System.out.println(response.getContentType());
	 ValidatableResponse valid = response.then();
	 valid.assertThat().statusCode(200);
	 
	 valid.log().all();
	}
}
