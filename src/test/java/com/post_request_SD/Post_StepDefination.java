package com.post_request_SD;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.junit.Assert;

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
   Assert.assertTrue(response.getStatusCode() == 201);
}
@Then("Validate user ID have noo null value")
public void Validate_user_ID_have_noo_null_value (){
	String actID =response.body().jsonPath().getString("id");
	Assert.assertTrue(Integer.parseInt(actID) > 0);
	Assert.assertTrue(actID != null);
	}

@Given("Create user with data from file")
public void Create_user_with_data_from_file() throws IOException {
	  String jsonData = new String (Files.readAllBytes(Paths.get("src/test/resources/com/post_request_FF/user.json")));
      JSONObject jsonObj = new JSONObject(jsonData); 
      jsonObj.put("name", "Ruksana");
      jsonObj.put("mob", "333");
      String actJson = jsonObj.toString();
      System.out.println("Json  before POST = "+actJson);
      
   response=RestAssured
			.given()
			.relaxedHTTPSValidation()
			.accept(ContentType.JSON)
			.body("actJson")
			.post("https://reqres.in/api/users");
}


@Given("Create user {string} with data from file")
public void create_user_with_data_from_file(String string) throws IOException {
	 String jsonData = new String (Files.readAllBytes(Paths.get("src/test/resources/com/post_request_FF/user.json")));
     JSONObject jsonObj = new JSONObject(jsonData); 
     jsonObj.put("name", "Sonam");
     jsonObj.put("mob", "333");
     String actJson = jsonObj.toString();
     System.out.println("Json  before POST = "+actJson);
     
  response=RestAssured
			.given()
			.relaxedHTTPSValidation()
			.accept(ContentType.JSON)
			.body("actJson")
			.post("https://reqres.in/api/users");
   
}
@Then("validate user ID have noo null value")
public void validate_user_id_have_noo_null_value() {
	String actID =response.body().jsonPath().getString("id");
	Assert.assertTrue(Integer.parseInt(actID) > 0);
	Assert.assertTrue(actID != null);
   
}



}
