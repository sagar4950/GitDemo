package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.RediffHomepage;
import Objectrepository.Rediffloginpage;

public class Loginapplication {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Rediffloginpage rd=new Rediffloginpage(driver);
		
		rd.Emailid().sendKeys("hello");
		rd.Password().sendKeys("123456");
		//rd.Submit();
		RediffHomepage rfh=new RediffHomepage(driver);
		rd.Home().click();
		rfh.Search().sendKeys("tea");
		
	}
	
}
