package stepDefinitions;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.ConfrimDetails;
import pageObjects.Giftcardformdetailspage;
import utilities.DataReader;



//*****************DataDrivenTesting***************//
public class giftcardFormdetails {
	Logger logger=LogManager.getLogger();
	  List<HashMap<String, String>> datamap; //Data driven
       String rname;
       String remail;
       String rmobile;
       String cname;
       String cemail;
       String email;
       String cmobile;
       String caddress;
       String pincode;
	WebDriver driver=BaseClass.getDriver();
	Giftcardformdetailspage fp=new 	Giftcardformdetailspage (driver);
	@Then("user enters the invalid {string} from excel in the form")
	public void user_enters_the_invalid_from_excel_in_the_form(String row) throws InterruptedException {
		 BaseClass.getLogger().info("User passes values from excel.. ");
		datamap=DataReader.data(System.getProperty("user.dir")+"/TestData/Data.xlsx", "Sheet1");

		int index=Integer.parseInt(row)-1;
         rname= datamap.get(index).get("Recipientsname");
         remail= datamap.get(index).get("Recipientsemail");
         rmobile= datamap.get(index).get("Recipientmobile");
         cname= datamap.get(index).get("Customername");
         cemail= datamap.get(index).get("Customeremail");
         cmobile= datamap.get(index).get("Customermobile");
         caddress= datamap.get(index).get("Customeraddress");
         pincode=datamap.get(index).get("Pincode");

		fp.recipientname(rname); 
		fp.recipientemail(remail); 
		fp.recipientemobile(rmobile); 	
		fp.customername(cname);
		fp.customeremail(cemail);
		fp.customermobile(cmobile); 
		fp.customeraddress(caddress);
		fp.pincode(pincode);
	}
	@Then("user enters the valid {string} from excel in the form")
	public void user_enters_the_valid_from_excel_in_the_form(String row) {
		 BaseClass.getLogger().info("User passes value from excel.. ");
		datamap=DataReader.data(System.getProperty("user.dir")+"/TestData/Data.xlsx", "Sheet1");

		int index=Integer.parseInt(row)-1;
         rname= datamap.get(index).get("Recipientsname");
         remail= datamap.get(index).get("Recipientsemail");
         rmobile= datamap.get(index).get("Recipientmobile");
         cname= datamap.get(index).get("Customername");
         cemail= datamap.get(index).get("Customeremail");
         cmobile= datamap.get(index).get("Customermobile");
         caddress= datamap.get(index).get("Customeraddress");
         pincode=datamap.get(index).get("Pincode");

		fp.recipientname(rname); 
		fp.recipientemail(remail); 
		fp.recipientemobile(rmobile); 	
		fp.customername(cname);
		fp.customeremail(cemail);
		fp.customermobile(cmobile); 
		fp.customeraddress(caddress);
		fp.pincode(pincode);
	}

	

	@Then("user clicks the submit button")
	public void user_clicks_the_submit_button() {
		 BaseClass.getLogger().info("User clicks submit button.. ");
		fp.button();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fp.button();
	}
	
	@Then("user checks the confirmdetails page is visible")
	public void user_checks_the_confirmdetails_page_is_visible() {
		 BaseClass.getLogger().info("User checks page is visible ?.. ");
		fp.pagenavigation();
	}

	@Then("validate the input provided with the inputs in Details section")
	public void validate_the_input_provided_with_the_inputs_in_details_section() {
		 BaseClass.getLogger().info("User validates the data eneterd with data displayed.. ");
		ConfrimDetails confrimDetails = new ConfrimDetails(driver);
		confrimDetails.valid_details(rname,remail,rmobile,cname,cemail,cmobile,caddress);
	}

	
}
