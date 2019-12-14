package myPack01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase01 

{
	WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		//driver=new ChromeDriver();
		//open browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\TechAltum_Selenium_Project-4\\browser_drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("page title is: " +title);
		
		if(title.contains("Snapdeal"))	
		{
			System.out.println("title is matched");	
		}
		else
		{
			System.out.println("title is not matched");
			
		}
		

	
	}
	

	@Test
	public void testfacebookRegistration()
	{
		
	}
	
	@AfterMethod
	public void quitBrowser()
	{
		driver.quit();
		
	}
	 
	
	

	
}
