package stepDefinitions;


import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
		 WebDriver driver;
		 Properties p;
		 Logger logger=LogManager.getLogger();
	     
		@Before
	    public void setup() throws IOException
	    {
			 BaseClass.getLogger().info("driver opens.. ");
	    	driver=BaseClass.initilizeBrowser();    	
	    	p=BaseClass.getProperties();
	    	driver.get(p.getProperty("appURL"));
	    	driver.manage().window().maximize();
	     			
		}
			
	    
	    @After
	    public void tearDown(Scenario scenario) {
	    	 BaseClass.getLogger().info("Driver closed.. ");
	       driver.quit();
	       
	    }
	    

	    @AfterStep
	    public void addScreenshot(Scenario scenario) {
	        
	    	// this is for cucumber junit report
	        if(scenario.isFailed()) {
	        	
	       	TakesScreenshot ts=(TakesScreenshot) driver;
	       	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
	        scenario.attach(screenshot, "image/png",scenario.getName());
	        	            
	        }
	      
	    }
	   
	}


