
  package StepDefinitionLayer;
  
  import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import
  io.cucumber.java.en.When;

  
  public class HRMLogin { 
	  static WebDriver driver;
  
  @Given("user is on login page") public void user_is_on_login_page() throws
  InterruptedException { // connect to actual browser
  System.setProperty("webdriver.chrome.driver",
  "C:\\Users\\Nikhil\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );

  // up casting 
  driver = new ChromeDriver();
  
   //open URL 
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  
  Thread.sleep(7000); 
  }
  
  @When("user enter valid credentials") public void
  user_enter_valid_credentials() throws InterruptedException {
  
  driver.findElement(By.name("username")).sendKeys("Admin");
  driver.findElement(By.name("password")).sendKeys("admin123");
  driver.findElement(By.xpath("//button[@type='submit']")).click(); 
  Thread.sleep(5000); 
  }
  
  @Then("user validate home page title") public void
  user_validate_home_page_title() {
  
  String actualTitle = driver.getTitle();
  
  Assert.assertEquals(actualTitle, "OrangeHRM");
  
 
 
  
  }
  
  }
