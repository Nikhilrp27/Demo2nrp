package StepDefinitionLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import PageLayer.FacebookLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class FacebookLogin extends BaseClass{

	@Given("user open a {string} browser")
	public void user_open_a_browser(String browsername) {
		BaseClass.initialization(browsername);
	}

	@Given("user will be on facebook register page")
	public void user_will_be_on_facebook_register_page() {
		
		System.out.println("User is on Reg Page");
		
	}

	@When("user enter valid {string} , {string} , {string} , {string} ,")
	public void user_enter_valid(String firstname, String lastname, String email, String pass) {
	
		FacebookLoginPage facebookloginpage = new FacebookLoginPage();
		facebookloginpage.FacebookLoginPageFunct(firstname, lastname, email, pass);
	
	}

	@When("user select {string} , {string} , {string} and select {string} gender")
	public void user_select_and_select_gender(String day, String month, String year, String gender) {
	
		
		FacebookLoginPage facebookloginpage1 = new FacebookLoginPage();
		facebookloginpage1.FacebookLoginPageFunct1(day, month, year);
		/*
		 * WebElement bdate = driver.findElement(By.name("birthday_day")); Select sel =
		 * new Select(bdate); sel.selectByIndex(day);
		 * 
		 * 
		 * WebElement bmonth = driver.findElement(By.name("birthday_month")); Select
		 * sel1 = new Select(bmonth); sel1.selectByVisibleText(month);
		 * 
		 * WebElement byear = driver.findElement(By.name("birthday_year")); Select sel2
		 * = new Select(byear); sel2.selectByIndex(year);
		 */
		
		List<WebElement> ls = driver.findElements(By.xpath("//label[@class='_58mt']"));
		
		for(WebElement abc : ls)
		{
			String a = abc.getText();
			
			if(a.equalsIgnoreCase(gender))
			{
				abc.click();
			}
		}
	  
	}

}
