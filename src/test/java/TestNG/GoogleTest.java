package TestNG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		 // Optional. If not specified, WebDriver searches the PATH for chromedriver.
	    System.setProperty("webdriver.chrome.driver", "/Users/sharon/Downloads/chromedriver");	
	    driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://www.google.com/");
	    
	    
	    //PageloadTimeOut
	  //  driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
	    
	    //ExpectedConditions
	  //  WebDriverWait wait = new WebDriverWait(driver, 10);
	    
	 //   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(>someid>)));
	    
	   
	    
	}
	
	@DataProvider
	public Iterator<String> searchKeyWordsProvider() {
		ArrayList<String> keyWords = new ArrayList<String>();
		keyWords.add("Java");
		keyWords.add("Python");
		keyWords.add("Ruby");
		Iterator<String> it = keyWords.iterator();
		return it;

	}
	
	 @Test(dataProvider="searchKeyWordsProvider", priority=2)
	  public void testGoogleSearch(String keyWords) throws InterruptedException {
	   	    
	    Thread.sleep(5000);  // Let the user actually see something!
	    WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys(keyWords);
	    searchBox.submit();
	    Thread.sleep(5000);  // Let the user actually see something!
	   //driver.findElement(By.id("id"));
	    
	  }
	 
	 @Test(priority=1)
	 public void testGoogleTitle() {
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 Assert.assertEquals(title, "Google", "Title is not matched!");
		 
	 }
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}
	
}
