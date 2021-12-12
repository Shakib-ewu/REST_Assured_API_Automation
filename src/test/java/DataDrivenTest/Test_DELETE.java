package DataDrivenTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@SuppressWarnings("unused")
public class Test_DELETE extends datadriventest {

	
	
	@Test(dataProvider="DeleteData")
	void test_delete(int userId)
	{
		JSONObject request=new JSONObject();
		baseURI = "http://localhost:3000/";
		given().
		when().
		delete("/users/"+userId).
		then().
		statusCode(404);
	}
}


