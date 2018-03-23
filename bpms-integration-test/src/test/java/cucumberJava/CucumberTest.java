package cucumberJava;

import cucumber.api.java.en.Given; 
import cucumber.api.java.en.When; 
import cucumber.api.java.en.Then;

public class CucumberTest {
	

			
		   @Given("^I have open the browser$") 
		   public void openBrowser() { 
		      System.out.println("Given statement");
		   } 
			
		   @When("^I open BBC website$") 
		   public void goToFacebook() { 
			   System.out.println("When statement");
		   } 
			
		   @Then("^Home Page Exists$") 
		   public void homePage() { 
			   System.out.println("Then statement");
		   } 

}
