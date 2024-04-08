package stepDefinitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Headers;

public class Header_section {
		WebDriver driver=BaseClass.getDriver();
		Headers header =new Headers(driver);
		Actions action = new Actions(driver);
		Logger logger=LogManager.getLogger();
		
		@Given ("the user scrolls up to Header")
		public void the_user_scrolls_up_to_Header(){
			 BaseClass.getLogger().info("User validates the scroll.. ");
			header.scrollheader();
			
		}
		@Then("the user clicks on Living storage")
		 public void the_user_clicks_on_living_storage() {
			 BaseClass.getLogger().info("User clicks on living storage header.. ");
			header.selectliving();
		 }

		 @Then("the user extracts all items under living storage")
		  public void the_user_extracts_all_items_under_living_storage() {
			 BaseClass.getLogger().info("User extracts all items under living storage.. ");
			  header.headers();
			
				}
		  }
	
