package StepDefinations;
import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

/**
 * @author Gamana
 *
 */
@RunWith(Cucumber.class)
public class StepDefination {

	 @Given("^User is on Netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
		 System.out.println("user_is_on_netbanking_landing_page");
		 System.out.println("user_is_on_netbanking_finish_page");
		 System.out.println("user_is_on_netbanking_loading_page");
	       // throw new PendingException();
	        
	    }

	    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	        //throw new PendingException();
	    	System.out.println(strArg1);
	    	System.out.println(strArg2);
	    	
	    }


	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	 System.out.println("home_page_is_populated");
	    	 System.out.println("home_page_is_populated1");
	    	 System.out.println("home_page_is_populated2");
	    	 System.out.println("home_page_is_populated3");
	    	 System.out.println("home_page_is_populated4");
	    	 System.out.println("home_page_is_populated5");
	    }

	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	       // throw new PendingException();
	    	System.out.println(strArg1);
	    }
}