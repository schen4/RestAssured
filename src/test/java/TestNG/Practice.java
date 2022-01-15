package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import junit.framework.Assert;

import org.testng.annotations.*;

public class Practice {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/sharon/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority=1)
	public void testGoogleTitle() {
		 String title = driver.getTitle();
		 System.out.println(title);		 
		 Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void testGoogleSearch() throws InterruptedException {
		Thread.sleep(5000);
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java");
		searchBox.submit();
		Thread.sleep(5000);
	}
	
	@Test(priority=3)
	public void testFindElementFromElement() {
		WebElement searchForm = driver.findElement(By.tagName("form"));
		WebElement searchBox = searchForm.findElement(By.name("q"));
		searchBox.sendKeys("webdriver");
		searchBox.submit();
		
	}
	
	@Test
	public void testFindElments() {
		List<WebElement> elements = driver.findElements(By.tagName("div"));
		for(WebElement elem : elements) {
			System.out.println(elem.getText());
		}
	}
	
	@Test
	public void testFindElementsFromElement() {
		WebElement searchForm = driver.findElement(By.tagName("div"));
		
		List<WebElement> elements = searchForm.findElements(By.tagName("p"));
		for(WebElement e : elements ) {
			System.out.println(e.getText());
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
