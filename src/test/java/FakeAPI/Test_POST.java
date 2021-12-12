package FakeAPI;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_POST {
	
	@SuppressWarnings("unchecked")
	@Test
	void test_POST()
	{
		JSONObject request=new JSONObject();
		
		
		request.put("firstName","Asif");
		request.put("lastName","Ahmed");
		request.put("subjectId",1);
		baseURI = "http://localhost:3000/";
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		
		when().
		post("/users").
		then().
		statusCode(201);
		

}
}
