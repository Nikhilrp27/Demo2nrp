package StepDefinitionLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FBLogin {

	//protected static 
	WebDriver driver;
//	@Given("user is on reg Page")
//	public void user_is_on_reg_page() throws InterruptedException {
//	 
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Nikhil\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//
//		// up casting
//		driver = new ChromeDriver();
//
//		// open URL
//		driver.get("https://www.facebook.com/reg");
//
//		Thread.sleep(2000);
//	}
//		

//	@When("user enters {string}, {string} ,{string} and {string}")
//	public void user_enters_and(String firstname, String lastname, String username, String password) throws InterruptedException {
//	
//		driver.findElement(By.name("firstname")).sendKeys(firstname);
//		driver.findElement(By.name("lastname")).sendKeys(lastname);
//		driver.findElement(By.name("reg_email__")).sendKeys(username);
//		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
//		
//		Thread.sleep(2000);
//		

	// }

	@Given("user is on reg Page")
	public void user_is_on_reg_page() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// up casting
		driver = new ChromeDriver();

		// open URL
		driver.get("https://www.facebook.com/reg");

		Thread.sleep(2000);

	}

	@When("user enters {string}, {string} ,{string} and {string}")
	public void user_enters_and(String firstname, String lastname, String username, String password) throws InterruptedException {

	driver.findElement(By.name("firstname")).sendKeys(firstname);
	driver.findElement(By.name("lastname")).sendKeys(lastname);
	driver.findElement(By.name("reg_email__")).sendKeys(username);
	driver.findElement(By.name("reg_passwd__")).sendKeys(password);
	
	Thread.sleep(2000);
	

	}

}
