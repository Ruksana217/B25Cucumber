package com.Get_datadriven_SD;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_StepDefination {
	
	Response response =null;

	@Given("Hit the bookstore api")
	public void hit_the_bookstore_api() {
		
	  response = RestAssured.get("https://demoqa.com/BookStore/v1/Books") ;
	}
	@Then("Validate as status code")
	public void validate_as_status_code() {
		int statusCode = response.getStatusCode();
		Assert.assertTrue("Status code not matching", statusCode ==200);
	}
	
	

	@Then("Validate data {string} from {string} response")
	public void validate_data_from_response(String abc, String jsonPath) {
	    
			String actualValue = response.getBody().jsonPath().getString(jsonPath);
			Assert.assertTrue("Value not maching", abc.equals(actualValue));
			
			
		}
	}


