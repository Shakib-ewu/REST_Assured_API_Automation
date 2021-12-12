package FakeAPI;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class Test_PUT {
	@SuppressWarnings("unchecked")
	@Test
	void test_put()
	{
		JSONObject request=new JSONObject();


		request.put("firstName","Jakob");
		request.put("lastName","Oram");
		request.put("subjectId",1);

		baseURI = "http://localhost:3000/";

		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).

		when().
		put("/users/4").
		then().
		statusCode(200);
	}




}
