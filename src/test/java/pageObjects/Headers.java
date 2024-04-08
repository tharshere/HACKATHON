package pageObjects;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Headers extends Homepage{
	public Headers (WebDriver driver) {
		super(driver);
	}
	Actions action = new Actions(driver);
	ArrayList<String> list = new ArrayList<String>();
	@FindBy(xpath="//*[@id='topnav_wrapper']/ul/li[3]/span")WebElement Living;
	@FindBy(xpath="//*[@id='topnav_wrapper']/ul/li[3]/span") WebElement menu;
	@FindBy(xpath="//*[@id='topnav_wrapper']/ul/li[3]/div/div/ul/li[3]/div/a") WebElement submenu;
	@FindBy(xpath="//*[@id='topnav_wrapper']/ul/li[3]/div/div/ul/li[3]/ul/li['+i+']/a/span")WebElement header;

	public void scrollheader() {
		action.moveToElement(Living);
	}
	public void selectliving() {
		action.moveToElement(Living);
		Living.click();
}
	public String selectmenu() {
		menu.click();
		return menu.getText();
	}
	public void submenu() {
		submenu.click();
	}
	public void headers() {
		for(int i =1;i<=9;i++) {
		  WebElement headers= driver.findElement(By.xpath("//*[@id='topnav_wrapper']/ul/li[3]/div/div/ul/li[3]/ul/li["+i+"]/a/span"));
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds (10));
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='topnav_wrapper']/ul/li[3]/div/div/ul/li[3]/ul/li["+i+"]/a/span"))); 
		  System.out.println(headers.getText());
		}
		
	}

	
	
	
	
}
