package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Giftcardpage extends Homepage {
   public Giftcardpage(WebDriver driver) {
		super(driver);
	}
   Actions act = new Actions(driver);

	@FindBy(xpath="//*[@id='header']/section//li[3]/a") WebElement giftcard;
	@FindBy(xpath="//*[@id='app-container']/div/main/section/section[1]/ul/li[3]") WebElement Birthdayoranniversary ;
	@FindBy(xpath="//button[contains(text(),'5000')]") WebElement amountselection ;
	@FindBy(xpath="//*[@id='ip_2251506436']") WebElement Enteramount ;
	@FindBy(xpath="//*[@id='app-container']//div//select[1]") WebElement selectmonth;
	@FindBy(xpath="//*[@id='app-container']//div//select[2]") WebElement selectdate;
	@FindBy(xpath="//*[@id='app-container']//div/section/button") WebElement Button ;	
	@FindBy(xpath="//*[@id='app-container']/div/main/section/section[3]/h2") WebElement formpage;

	public void opengiftcard() {
		act.moveToElement(giftcard);
		giftcard.click();
	}
	public void birthdayoranniversary() {
		act.moveToElement(Birthdayoranniversary);
		Birthdayoranniversary.click();
	}
	public void amountselection() {
		act.moveToElement(amountselection);
		amountselection.click();
	}
	public void Enteramount(String string) {
		Enteramount.sendKeys(string);
	}
	public void selectmonth() {
		Select select = new Select(selectmonth);
		select.selectByIndex(2);
		
	}
	public void selectdate() {
		Select select = new Select(selectdate);
		select.selectByIndex(11);
	}
	public void confirmbutton() {
		Button.click();
	}
	public boolean formpage() {
		act.moveToElement(formpage).build().perform();
		if(formpage.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
