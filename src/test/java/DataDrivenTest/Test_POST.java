package DataDrivenTest;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

@SuppressWarnings("unused")
public class Test_POST extends datadriventest {
	
	
	@SuppressWarnings("unchecked")
	@Test(dataProvider= "dataForPost")
	public void test_POST_DDT(String firstName,String lastName,int subjectid)
	{
		JSONObject request=new JSONObject();
		
		
		request.put("firstName",firstName);
		request.put("lastName",lastName);
		request.put("subjectId",subjectid);
		
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
				
				


