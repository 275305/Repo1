package a.rest.assured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_GET01 {

	
	@Test
	public void restTest_01() {
		
		given().get("https://reqres.in/api/users").then().statusCode(200).log().all();

	/*given().
	get("https://reqres.in/api/users?page=2").
	then().statusCode(200).body("data.id[0]", equalTo(7))
	.body("data.first_name",hasItems("Michael","Lindsay","Tobias") );*/
	
	
			
	}

	
}
