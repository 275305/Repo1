package a.rest.assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAPI_Test01 {

	@Test
	public void restTestGet() {

		Response getResponse_Employee = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		System.out.println(getResponse_Employee.asString());
		System.out.println(getResponse_Employee.getBody().asString());
		System.out.println(getResponse_Employee.getStatusCode());
		System.out.println(getResponse_Employee.getStatusLine());
		System.out.println(getResponse_Employee.getHeader("content-type"));
		System.out.println(getResponse_Employee.getTime());
	}

}
