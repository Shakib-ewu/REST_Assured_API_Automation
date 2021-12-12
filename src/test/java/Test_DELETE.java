
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_DELETE {

	@Test
	void test_POST()
	{
		@SuppressWarnings("unused")
		JSONObject request=new JSONObject();
		given().
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204);

	}
}
