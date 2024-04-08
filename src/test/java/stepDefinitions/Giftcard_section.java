package stepDefinitions;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Giftcardpage;

public class Giftcard_section 
{
	WebDriver driver=BaseClass.getDriver();
	Giftcardpage gp=new Giftcardpage(driver);
	Logger logger=LogManager.getLogger();
    

    @Then("user gives the preferred invalid inputs")
    public void user_gives_the_preferred_invalid_inputs(String string) {
    	BaseClass.getLogger().info("User enters invalid amount in Giftcard page.. ");
    	gp.amountselection();
    	gp.Enteramount(string);
    }
    @Then("user enters the amount {string} in amount section")
    public void user_enters_the_amount_in_amount_section(String string) {
    	BaseClass.getLogger().info("User enters valid amount in Giftcard page.. ");
    	gp.Enteramount(string);
    }

    @Then("user selects month and date")
    public void user_selects_month_and_date() {
    	BaseClass.getLogger().info("User selects month and date.. ");
    	gp.selectmonth();
		gp.selectdate();
    }
    
	@Given("the user navigates to Giftcard page")
	  public void the_user_navigates_to_giftcard_page() {
		gp.opengiftcard();
	  }
	  @Then("the user selects Birthday\\/Aniversary occasion")
	  public void the_user_selects_birthday_aniversary_occasion() {
		  BaseClass.getLogger().info("User selects birthday/occassion.. ");
		  gp.birthdayoranniversary();
	  }
	  @Then("user enters the preferred <value> in sections")
	  public void user_enters_the_preferred_value_in_sections() {
		  BaseClass.getLogger().info("User enters valid details in Giftcard page.. ");
		  gp.amountselection();
		  gp.selectmonth();
		  gp.selectdate();
		  gp.confirmbutton();
		  
	  }
	     	
	  @Then("user select amount input")
	  public void user_select_amount_input() {
		  BaseClass.getLogger().info("User enters valid amount in Giftcard page.. ");
		  gp.amountselection(); 
	  }

	  @Then("user should check form page")
	  public void user_should_check_form_page() {
		 boolean result = gp.formpage();
		Assert.assertEquals(result , true);
	  }
	 
	  @Then("user navigates without selecting  inputs")
	  public void user_navigates_without_selecting_inputs() {
		  gp.opengiftcard();
		  gp.birthdayoranniversary();
		  gp.confirmbutton();
		  
	  }

	  @Then("user enters the preferred {string} in sections and selects valid inputs")
	  public void user_enters_the_preferred_in_sections_and_selects_valid_inputs(String string) {
		  BaseClass.getLogger().info("User enters valid amount in Giftcard page.. ");
		  gp.opengiftcard();
		  gp.birthdayoranniversary();
		  gp.Enteramount(string);
		  gp.selectdate();
		  gp.confirmbutton();
	  }
	  @Then("user clicks next Button")
	  public void user_clicks_next_button() {
		  BaseClass.getLogger().info("User clicks confirm button.. ");
		  gp.confirmbutton();
	  }
	
	  

}
