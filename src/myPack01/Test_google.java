package myPack01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_google
{
	WebDriver driver;
	
	@BeforeTest
	public void Openbrowser()
	{
		//Open browser
		String projectPath = System.getProperty("user.dir");
		System.out.println("Projejct Path is = " + projectPath);
		
	String browserDriverPath = projectPath + "\\browser_drivers\\chromedriver.exe";
		System.out.println("Browser Driver exe path = " + browserDriverPath);
		
		System.setProperty("webdriver.chrome.driver", browserDriverPath);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://google.com");
		
		//Validate that user is on correct page
		String pageTitle = driver.getTitle();
		System.out.println("Page title is = " + pageTitle);
	}
	
	@Test
	public void TestGoole() throws InterruptedException
	{
	String fromCityName = "java";
	WebElement fromCity = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
	fromCity.sendKeys(fromCityName);
	System.out.println("From city is entered = " + fromCityName);
	List<WebElement> numberoflist = driver.findElement(By.xpath("//ul[@class='erkvQe']")).findElements(By.tagName("li"));
	Thread.sleep(5000);
	System.out.println("Total suggestions are = " + numberoflist.size());
	System.out.println("run sucessfully");
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	}


