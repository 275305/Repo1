package getRequest;
import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
public class getData {
   
    
    
    
    
	/*public void testResponse() {
	Response resp=RestAssured.post("http://uat-matrix-api-alb-1170605185.ap-south-1.elb.amazonaws.com/api/logins/login");
     int code=resp.getStatusCode();
     System.out.println(code);
}*/ @Test
    public void RegistrationSuccessful()
   
    {
    	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
    	RequestSpecification httpRequest = RestAssured.given();
    	Response response = httpRequest.get("/Hyderabad");
     
    	// Retrieve the body of the Response
    	ResponseBody body = response.getBody();
     
    	// By using the ResponseBody.asString() method, we can convert the  body
    	// into the string representation.
    	System.out.println("Response Body is: " + body.asString());
    }
}