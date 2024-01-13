package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class FacebookLoginPage extends BaseClass {

	@FindBy(name = "firstname")
	private WebElement firstname;

	@FindBy(name = "lastname")
	private WebElement lastname;

	@FindBy(name = "reg_email__")
	private WebElement email;

	@FindBy(name = "reg_passwd__")
	private WebElement pass;

	@FindBy(name = "birthday_day")
	private WebElement day;

	@FindBy(name = "birthday_month")
	private WebElement month;

	@FindBy(name = "birthday_year")
	private WebElement year;

//	@FindBys(xpath = "//label[@class='_58mt']")
//	private List <WebElement> ls;
//	

	public FacebookLoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void FacebookLoginPageFunct(String Firstname, String Lastname, String Email, String Pass)
	{

		firstname.sendKeys(Firstname);
		lastname.sendKeys(Lastname);
		email.sendKeys(Email);
		pass.sendKeys(Pass);
		

	}
	
	public void FacebookLoginPageFunct1(String Day, String Month, String Year) {
		
		Select sel = new Select(day);
		sel.selectByVisibleText(Day);
		//day.sendKeys(Day);
		month.sendKeys(Month);
		year.sendKeys(Year);
	}

//	List<WebElement> ls = driver.findElements(By.xpath("//label[@class='_58mt']"));
//	
//	for(WebElement abc : ls)
//	{
//		String a = abc.getText();
//		
//		if(a.equalsIgnoreCase(gender))
//		{
//			abc.click();
//		}
//	}

}
