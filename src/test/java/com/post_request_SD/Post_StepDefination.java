package com.post_request_SD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post_StepDefination {
	

  Response  response;

@Given("Create user with data")
public void creat_user_with_data() {
	response =		RestAssured
			.given()
			.relaxedHTTPSValidation()
			.accept(ContentType.JSON)
			.body("{\r\n"
					+ "\"Username\": \"AnilKale\",\r\n"
					+ "\"Job\": \"Maneger\",\r\n"
					+ "\"Dept\": \"QA automation\",\r\n"
					+ "\"Mobile\": \"111\"\r\n"
					+ "}")
			.post("https://reqres.in/api/users");
	}

@Then("Validate user created")
public void validate_user_created() {
   String allresp = response.asString();
   System.out.println("all details = " +allresp);
   System.out.println("Status code = " +response.getStatusCode());
}

}
