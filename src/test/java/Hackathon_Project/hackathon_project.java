package Hackathon_Project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class hackathon_project {
	
	 static  String user_details;
     static  WebDriver driver;
     static  String recipientsname="Sankar";
     static String recipientsemail ="Ajay@gmail.com";
     static String recipientmobile ="9876543212";
     static String customername="Kishore";
     static String customeremail="kishore@gmail.com";
     static String customermobile="9876543210";
     static String customeraddress="123,xyz street,abc stop";
     static String pincode="625007";
     static String city="Madurai";
     
     public static void main(String args[]) throws InterruptedException, IOException {
    	 
    	 Homepage();
    	 Bookshelves();
    	 Submenu();
    	 boolean result=Giftcardsection();
    	 if(result==true) {
    		 validation();
    	 }
    	 else {
    		 screenshot();
    	 }
    	 
    	 closedriver();
     }
     
     
    public static void Homepage() { 
	
    driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://urbanladder.com");
	driver.manage().window().maximize();
	
      }
	
  public static void Bookshelves() {
	driver.findElement(By.xpath("//*[@id=\"urban-ladder-search\"]//form")).click();
	driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Bookshelves with price below 15000");
	driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id='authentication_popup']/div/div/div/a[1]")).click();
	driver.findElement(By.xpath("(//div[normalize-space()='Category'])[1]")).click();


          Actions a = new Actions(driver);
          WebElement target = driver.findElement(By.xpath("//*[@id=\"search-results\"]//div/div/div[2]/div[1]/span"));
          a.moveToElement(target).clickAndHold().build().perform();

  		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		
	      a.click(driver.findElement(By.xpath("//li[contains(text(),'Price: High to Low')]"))).build().perform();
	



    for(int i=1;i<=3;i++) {
		WebElement shelves = driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li["+i+"]//span"));	
		System.out.println(shelves.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement price = driver.findElement(By.xpath("//*[@id='search-results']/div[3]/ul/li["+i+"]/div/div[5]/a/div[2]/span"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(price.getText());
		
	}
     }
	
//--------------------------------------------------------------------------------------------------------//
	//HEADER ITEM SECTION
	
     
     public static void Submenu()
     {
	System.out.println();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions ac = new Actions(driver);
	WebElement living = driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[3]/span"));
	ac.scrollToElement(living).build().perform();
	living.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String menu =driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[3]/span")).getText();
	System.out.println(menu.toUpperCase());
	System.out.println();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	System.out.println(driver.findElement(By.xpath("//*[@id='topnav_wrapper']/ul/li[3]/div/div/ul/li[3]/div/a")).getText().toUpperCase());
	System.out.println();
	for(int i =1;i<=9;i++) {
	   	 WebElement element =driver.findElement(By.xpath("//*[@id='topnav_wrapper']/ul/li[3]/div/div/ul/li[3]/ul/li["+i+"]/a/span"));
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds (40));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='topnav_wrapper']/ul/li[3]/div/div/ul/li[3]/ul/li[\"+i+\"]/a/span")));
		 System.out.println(element.getText());
	}
  }

	//---------------------------------------------------------------------------------------------------//
	
	//GIFTCARD SECTION
	public static boolean Giftcardsection() {
		boolean result;
	Actions action= new Actions(driver);
	action.scrollToElement(driver.findElement(By.xpath("//*[@id='header']/section//li[3]/a"))).build().perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id='header']/section//li[3]/a")).click();
	
	action.scrollToElement(driver.findElement(By.xpath("//*[@id='app-container']/div/main/section/section[1]/ul/li[3]"))).build().perform();
	driver.findElement(By.xpath("//*[@id='app-container']/div/main/section/section[1]/ul/li[3]")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'5000')]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"ip_2251506436\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"ip_2251506436\"]")).sendKeys("10000");
	
	driver.findElement(By.xpath("//*[@id='app-container']//div//select[1]")).click();
	Select select = new Select(driver.findElement(By.xpath("//*[@id='app-container']//div//select[1]")));
	select.selectByIndex(2);
	
	Select s = new Select(driver.findElement(By.xpath("//*[@id='app-container']//div//select[2]")));
	s.selectByIndex(11);
	
	driver.findElement(By.xpath("//*[@id=\"app-container\"]//div/section/button")).click();
	
	

	driver.findElement(By.xpath("//*[@name='recipient_name']")).sendKeys(recipientsname);
	//Invalid Email id
	driver.findElement(By.xpath("//*[@name='recipient_email']")).sendKeys(recipientsemail);
	driver.findElement(By.xpath("//*[@name='recipient_mobile_number']")).sendKeys(recipientmobile);
	driver.findElement(By.xpath("//*[@name='customer_name']")).sendKeys(customername);
	driver.findElement(By.xpath("//*[@name='customer_email']")).sendKeys(customeremail);
	driver.findElement(By.xpath("//*[@name='customer_mobile_number']")).sendKeys(customermobile);
	driver.findElement(By.xpath("//*[@name='customer_address']")).sendKeys(customeraddress);
	//pincode
	driver.findElement(By.xpath("//*[@name=\"zip\"]")).sendKeys(pincode);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='app-container']//form/button"))).build().perform();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds (20));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app-container']//form/button")));
	driver.findElement(By.xpath("//*[@id='app-container']//form/button")).click();
	
	
	WebElement confirmmessage =driver.findElement(By.xpath("//*[@id='app-container']/div/main/section/section/div[2]"));
	int count=0;
	
	if(confirmmessage.isDisplayed()) {
		result = true;
	}
	else 
	{
		result =false;
	}
	return result;
	
	}
	
	static void validation() {
	int count=0;
		for(int i=1;i<=3;i++) {
			String value =driver.findElement(By.xpath("//*[@id='app-container']//div[2]/div[1]/div[2]//div["+i+"]")).getText();
			
			if(value.equalsIgnoreCase(recipientsname)) {
				count=0;
				break;
			}
			else if(value.equalsIgnoreCase(recipientsemail)) {
					count=0;
					System.out.println("remail passed");
					break;
					
				}
			else if(value.equalsIgnoreCase(recipientmobile)) { 
					System.out.println("rmobile passed");
					count=0;
					break;
				}
				else if(!value.equalsIgnoreCase(recipientsname) || !value.equalsIgnoreCase(recipientsemail) || !value.equalsIgnoreCase(recipientmobile)){
					count=1;
					System.out.println(value +"failed");
					break;
				
				}
			}
		
		for(int j=1;j<=3;j++) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String value1 =driver.findElement(By.xpath("//*[@id=\"app-container\"]//div[2]/div[2]/div/div["+j+"]")).getText();
			if(value1.equals(customername)) {
				
				count=0;
			}
			else if( value1.equalsIgnoreCase(customeremail)) {
				
					count=0;
				}
				else if( value1.equalsIgnoreCase(customermobile)) { 
					
					count=0;
				}
				else if( value1.equalsIgnoreCase(customeraddress)) { 
					count=0;
					
				}
				else if(!value1.equalsIgnoreCase(customername) || !value1.equalsIgnoreCase(customeremail) || !value1.equalsIgnoreCase(customermobile)){
					count=1;
				}
			}
		if(count==0) {
			System.out.println("All details are validated");
		}
		else {
			System.out.println("Values entered are mismatched");
		}
	     
		
	}
	
		
	static void screenshot() {
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\2318721\\eclipse-workspace\\Hackathon_Project\\screenshot\\Screenshot.png");
		try {
			FileUtils.copyFile(srcFile, destFile);
			System.out.println("screenshot saved !");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static void closedriver() {
		driver.close();
	}
	
}
