package a.rest.assured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_PUT_01 {

	@Test
	public void testPost_01() {
	
		JSONObject jsonObjRequest=new JSONObject();
		/*System.out.println(jsonObjRequest);*/
		
		jsonObjRequest.put("name", "morpheus");
		jsonObjRequest.put("job", "leader");
		System.out.println(jsonObjRequest);
		
		/*how to use BDD approach in API Automation*/
		/*in put method only change the ULR here */
		given().
		   header("Content-Type","application/json").
		   contentType(ContentType.JSON).
		   body(jsonObjRequest.toJSONString()).
		when().
		   put("https://reqres.in/api/users/2").
		then().statusCode(201);
		

	}

}
