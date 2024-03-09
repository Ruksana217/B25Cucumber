package com.Get_SD;

import org.junit.Assert;

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
	
	@Then("Validate Git Pocket guide tittle present")
	public void validate_git_pocket_guide_tittle_present() {
	   String jsonDataString= response.getBody().asString();
	   System.out.println("JSON = "+jsonDataString);
	   String bookTitle = response.getBody().jsonPath().getString("books[0].title");
	   Assert.assertTrue("Title not matching", bookTitle.equals("Git Pocket Guide"));
	}
	

	@Then("validate Learning JavaScript Design Patterns tittle present")
	public void validate_learning_java_script_design_pattern_tittle_present() {
		 String jsonDataString= response.getBody().asString();
		   System.out.println("JSON = "+jsonDataString);
		   String bookTitle = response.getBody().jsonPath().getString("books[1].title");
		   Assert.assertTrue("Title not matching", bookTitle.equals("Learning JavaScript Design Patterns"));
	   
	}

	
	@Then("validate {string} at jsonpath {string} title present")
	public void validate_title_present(String title, String jsonPath) {
		String jsonDataString= response.getBody().asString();
		   System.out.println("JSON = "+jsonDataString);
		   String actualbookTitle = response.getBody().jsonPath().getString(jsonPath);
		   Assert.assertTrue("Title not matching", actualbookTitle.equals(title));
		
	}
	

	@Then("validate {string} at jsonpath {string} present")
	public void validate_at_jsonpath_present(String pages, String jsonPath) {
		String jsonDataString= response.getBody().asString();
		   System.out.println("JSON = "+jsonDataString);
		   String actualbookPage = response.getBody().jsonPath().getString(jsonPath);
		   Assert.assertTrue("Title not matching", actualbookPage.equals(pages));
		
	}

}

	
	
	/*@Then("validate Git Pocket guide pages present")
	public void validate_git_pocket_guide_pages_present(String pages, String jsonPath) {
		String jsonDataString= response.getBody().asString();
		   System.out.println("JSON = "+jsonDataString);
		   String actualbookTitle = response.getBody().jsonPath().getString(jsonPath);
		   Assert.assertTrue("Title not matching", actualbookTitle.equals(pages));
		
		
	}
	@Then("validate Learning JavaScript Design Patterns pages present")
	public void validate_learning_java_script_design_pattern_pages_present() {
	   
	}*/





