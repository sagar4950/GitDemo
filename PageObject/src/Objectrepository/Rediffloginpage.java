package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {
	
	WebDriver driver;
	
	
	public Rediffloginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By username =By.xpath("//*[@id=\"login1\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	
	By Home=By.linkText("rediff.com");
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}


	public WebElement Home() {
		// TODO Auto-generated method stub
		return driver.findElement(Home);	
		}
	
	
}
