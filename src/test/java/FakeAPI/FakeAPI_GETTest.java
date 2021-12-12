package FakeAPI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

public class FakeAPI_GETTest {

	@Test
	void Test_01()
	{
		baseURI = "http://localhost:3000/";

		given().
		get("/users").
		then().
		statusCode(200).
		body("firstName",hasItems("Sakib"));
		

	}

}
