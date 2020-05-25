package a.rest.assured;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_Post_01 {

	@Test
	public void testPost_01() {
	
		JSONObject jsonObjRequest=new JSONObject();
		/*System.out.println(jsonObjRequest);*/
		
		jsonObjRequest.put("name", "Pradeep Chauhan");
		jsonObjRequest.put("job", "Software Engineer");
		System.out.println(jsonObjRequest);
		
		/*how to use BDD approach in API Automation*/
		/*in post method you send a request*/
		given().
		   header("Content-Type","application/json").
		   contentType(ContentType.JSON).
		   body(jsonObjRequest.toJSONString()).
		when().
		   post("https://reqres.in/api/users").
		then().statusCode(201);
		

	}

}
