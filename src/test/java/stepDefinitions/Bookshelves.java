package stepDefinitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Bookshelvespage;


public class Bookshelves {

	WebDriver driver=BaseClass.getDriver();
	Bookshelvespage bp=new Bookshelvespage(driver);
	Logger logger=LogManager.getLogger();
	@Given("user set the catogory")
	public void user_set_the_catogory(){
	 BaseClass.getLogger().info(" User selects category.. ");
	 bp.selectcategory();
	 bp.categoryselection();
		
	}

	@Given("user set price in dropdown")
	public void user_set_price_in_dropdown() {
		   BaseClass.getLogger().info("User set price.. ");
		   bp.selectprice(); 
           bp.selectpricerange();
		}

	@When("the user enters the invalid input as \\(search :{string})")
	public void the_user_enters_the_invalid_input_as_search(String string) {
		BaseClass.getLogger().info("User enters invalid input.. ");
		bp.click_searchBox(); 
	    bp.EnterValuetoSearchBox(string); 
		bp.clicksearchButton(); 
	}
	
	@When("the user enters the input as search {string}")
	public void the_user_enters_the_input_as_search(String string) {
		BaseClass.getLogger().info("User enters valid input in searchbox.. ");
	    bp.click_searchBox(); 
	    bp.EnterValuetoSearchBox(string); 
		bp.clicksearchButton();
	}
	@When("user close the authentication popup")
	public void user_close_the_authentication_popup(){
		BaseClass.getLogger().info("User closes the popup.. ");
		bp.popup();
	}
	@When("user set the catogory price range")
	public void user_set_the_catogory_price_range(){
		BaseClass.getLogger().info("User selects category and price range.. ");
	     bp.selectcategory();
		 bp.categoryselection();
		 bp.selectprice(); 
		 bp.selectpricerange();
			
	  
	}
	@Then("user get the first three items name and price in console")
	public void user_get_the_first_three_items_name_and_price_in_console() {
		BaseClass.getLogger().info("User Extracts first three items name and price.. ");
		bp.displaynameandprice();
	}
}
