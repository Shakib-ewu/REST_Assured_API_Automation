package FakeAPI;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class Test_DELETE {
	
	@SuppressWarnings("unused")
	@Test
	void test_delete()
	{
		baseURI = "http://localhost:3000/";
		JSONObject request=new JSONObject();
		given().
		when().
		delete("/users/4").
		then().
		statusCode(404);
	}

}
