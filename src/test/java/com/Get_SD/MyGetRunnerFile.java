package com.Get_SD;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		          features= {"src/test/resources/com/Get_FF/"},
		          glue= {"com.Get_SD"},
		          tags = "@regression",
		          plugin= {"pretty",
		        		  "html:target/cucumber-htmlreport",
		        		  "json:target/cucumber-report6.json",}
		          
		)


public class MyGetRunnerFile {

}
