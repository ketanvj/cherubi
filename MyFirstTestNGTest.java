package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MyFirstTestNGTest {
	WebDriver driver; // instance variable for this class

	@Test
	public void nTLoginTest() throws InterruptedException {
		//input[@name="Petrol"]
		String petrol = "Petrol";
		int sdate = 25;
		int edate = 30;
		driver.findElement(By.xpath("//input[@name='" + petrol + "']"));
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("stc123");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("12345");
		
		//driver.findElement(By.tagName("div")).findElement(By.tagName("p"));
		
		//driver.findElement() -searches entire page. 
	    //myElement.findElement() - will search only inside "myElement"
		
		String name = "Infosys";
		name.toUpperCase().toLowerCase().toLowerCase().toUpperCase().toLowerCase().equals("infy");
		username.submit();
		Thread.sleep(5000); // synchronization
		String expectedPageTitle = "My account1";
		String actualPageTitle = driver.getTitle();
		System.out.println("Actual Title is " + actualPageTitle);
		/*
		 * if (expectedPageTitle.equals(actualPageTitle)) {
		 * System.out.println("Test Case Passed!"); } else {
		 * System.out.println("Test Case Failed!"); }
		 */
		
//		assertEquals(actualPageTitle, expectedPageTitle);
		assertEquals(actualPageTitle, expectedPageTitle, "Test Case Failed! as page title is not as expected.");
		//assertEquals is TestNG methods. Assert class of TestNG 
	}

	@BeforeMethod
	// indicates that the method followed by this annotation will
	// Execute before executing every test.
	public void beforeMethod() {
		driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver();
		driver.get("https://nichethyself.com/tourism/home.html");
	}

	@AfterMethod
	// indicates that the method followed by this annotation will
	// Execute after executing every test.
	public void afterMethod() {
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Inside BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Inside AfterClass");
	}

	@Test
	public void googleTest() {
		System.out.println("Inside Google Test");

	}

}
