
package com.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyBasic {
	
@Given("Login to HRMS system with valid user")

public void login_to_HRMS_system_with_valid_user() {
	System.out.println("I am login with user");
}
@When("Go to PIM tab")
	
public void GO_to_PIM_tab() {
	
	System.out.println("Performing action");
}

@Then("Add button check")
public void Add_button_check() {
	
	System.out.println("Checked Add buttoValidating buttonn");
}

}
