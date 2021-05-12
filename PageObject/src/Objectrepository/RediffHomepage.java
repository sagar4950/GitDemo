package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {

	WebDriver driver;

	public RediffHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By search = By.id("srchword");
	By submit=By.xpath("//input[@type='submit']");
	
	public WebElement Search() {
		return driver.findElement(search);
	}

	public void SearchClick()
	{
		driver.findElement(submit);
	}
	
}
