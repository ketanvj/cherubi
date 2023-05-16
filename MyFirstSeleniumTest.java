package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Steps:
		// 1. Open browsers

		 WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		// WebDriver is an interface. WebDriver represents your browser

		// 2. Go to the url
		driver.get("https://nichethyself.com/tourism/home.html");
		// get() takes us to the url for further steps.
		// 3. Enter username
		// Two steps -
		// 1. Tell Selenium Which element you want to take action on
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("stc123");		
//		    By userLocator = By.name("username");
//		    username = driver.findElement(userLocator);

		// findElement() returns an object of type WebElement
		// 2. Type.

		// Above way of writing is called method chaining
		// 4. Enter password
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("12345");

		String name = "Infosys";
		name.toUpperCase().toLowerCase().toLowerCase().toUpperCase().toLowerCase().equals("infy");

		// 5. Click on Submit
		username.submit();
		// 6. Validate/verify
		Thread.sleep(5000); //synchronization
		String expectedPageTitle = "My account1";
		String actualPageTitle = driver.getTitle();
		System.out.println("Actual Title is " + actualPageTitle);
		if (expectedPageTitle.equals(actualPageTitle)) {
			System.out.println("Test Case Passed!");
		} else {
			System.out.println("Test Case Failed!");
		}
		
		/* 
		 * Good practice with the following two steps:
		 * 1. Make sure your test case executes properly on all the supported browsers
		 * 2. Verify that test case is failing if the condition is not met. 
		 * 
		 */
		

	}

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public void useSumMethod() {
		int summation = sum(4, 5);

		String name = "Ketan";
		String upper = name.toUpperCase();
	}

}
