package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffloginpagePF {
	
	WebDriver driver;
	
	
	public RediffloginpagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//*[@id=\\\"login1\\\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\\\"password\\\"]")
	WebElement password;
	
	
	@FindBy(linkText="rediff.com")
	WebElement Home;
	
	
	
	public WebElement Emailid()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return password;
	}

	public WebElement Home() {
		// TODO Auto-generated method stub
		return Home;	
		}


	
	
}
