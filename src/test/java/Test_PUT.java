import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_PUT {
	
		@SuppressWarnings("unchecked")
		@Test
		void test_POST()
		{
			JSONObject request=new JSONObject();
			
			request.put("name","Sakib");
			request.put("job","student");
			
		
			
			System.out.println(request.toJSONString());
			
			given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
			
			when().
			put("https://reqres.in/api/users/2").
			then().
			statusCode(200);
			
		}
		}


	


