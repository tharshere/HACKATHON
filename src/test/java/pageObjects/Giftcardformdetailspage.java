package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Giftcardformdetailspage extends Homepage{

	
	public Giftcardformdetailspage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@name='recipient_name']") WebElement recipientname;
	@FindBy(xpath="//*[@name='recipient_email']") WebElement recipientemail;
    @FindBy(xpath="//*[@name='recipient_mobile_number']") WebElement recipientmobile;
    @FindBy(xpath="//*[@name='customer_name']") WebElement customername;
    @FindBy(xpath="//*[@name='customer_email']") WebElement customeremail;
    @FindBy(xpath="//*[@name='customer_mobile_number']") WebElement customermobile;
    @FindBy(xpath="//*[@name='customer_address']") WebElement customeraddress;
    @FindBy(xpath="//*[@name=\"zip\"]") WebElement pincode;
    @FindBy(xpath="//*[@id='app-container']//form/button") WebElement clickbutton;
    @FindBy(xpath="//*[@id='app-container']/div/main/section/section/div[2]") WebElement page;
	
	public void recipientname(String rname) {
		recipientname.sendKeys(rname);
	}
	public void recipientemail(String remail) {
		
		recipientemail.sendKeys(remail);
	}
	public void recipientemobile(String rmobile) {
		
		recipientmobile.sendKeys(rmobile);
	}
	public void customername(String cname) {
		
		customername.sendKeys(cname);
	}
	public void customeremail(String cemail) {
		
		customeremail.sendKeys(cemail);
	}
	public void customermobile(String cmobile) {
		
		customermobile.sendKeys(cmobile);
	}
	public void customeraddress(String caddress) {
	
		customeraddress.sendKeys(caddress);
	}
	public void pincode(String string) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pincode.sendKeys(string);
	}
	public void button() {
		
		clickbutton.click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void pagenavigation() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertEquals(page.isDisplayed(),true);
	}
   
}
