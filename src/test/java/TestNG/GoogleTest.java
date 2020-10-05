package TestNG;
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
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharon\\Downloads\\chromedriver\\chromedriver.exe");	
	    driver = new ChromeDriver();
	   // driver.manage().window().maximize();
	    driver.get("http://www.google.com/");
	}
	
	 @Test
	  public void testGoogleSearch() throws InterruptedException {
	   	    
	    Thread.sleep(5000);  // Let the user actually see something!
	    WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("ChromeDriver");
	    searchBox.submit();
	    Thread.sleep(5000);  // Let the user actually see something!
	   //driver.findElement(By.id("id"));
	    
	  }
	 
	 @Test
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
