package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Bookshelvespage extends Homepage{
	     
	public Bookshelvespage(WebDriver driver) {
		super(driver);
	}
	        Actions action = new Actions(driver);
	       
			@FindBy(xpath="//*[@id=\"urban-ladder-search\"]//form") WebElement SearchBox_click;
			@FindBy(xpath="//*[@id='search']") WebElement searchbox;
			@FindBy(xpath="//*[@id='search_button']") WebElement button;
			@FindBy(xpath="//*[@id='authentication_popup']/div/div/div/a[1]") WebElement popup;
			@FindBy(xpath="(//div[normalize-space()='Category'])[1]") WebElement category;
			@FindBy(xpath="//*[@id='search-results']//div/div/div[2]/div[1]/span") WebElement price;
			@FindBy(xpath="//input[@id='filters_primary_category_Kids_Bookshelves'][1]") WebElement categoryselection;
			@FindBy(xpath="//li[contains(text(),'Price: High to Low')]")
			public WebElement Hightolow;
			
			@FindBy(xpath="//*[@id='search-results']/div[3]/ul/li['+i+']/div/div[5]/a/div[2]/span") WebElement prices;
			
			
			public void click_searchBox() {
				SearchBox_click.click();
			}
			public void EnterValuetoSearchBox(String string) {
				searchbox.sendKeys(string);
			}
			public void clicksearchButton() {
				button.click();
			}
			public void popup() {
				popup.click();
			}
			public void selectcategory() {
				action.moveToElement(category);
				category.click();
			}
			public void categoryselection() {
				categoryselection.click();
			}
			public void selectprice() {
				price.click();
			}
			public void selectpricerange() {
				Hightolow.click();
			}
			public void displaynameandprice() {
			for(int i=1;i<=3;i++) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement itemnames=driver.findElement(By.xpath("//*[@id='search-results']/div[3]/ul/li["+i+"]//span")); 
				System.out.println(itemnames.getText());
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement price = driver.findElement(By.xpath("//*[@id='search-results']/div[3]/ul/li["+i+"]/div/div[5]/a/div[2]/span"));
				System.out.println(price.getText());
			}
}
			
}

		
	  	