package myPack01;

import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class rough 
	{

		WebDriver driver;
		
		@BeforeMethod
		public void openBrowser()
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
			driver.get("http://www.cheapoair.com");
			
			//Validate that user is on correct page
			String pageTitle = driver.getTitle();
			System.out.println("Page title is = " + pageTitle);
		}
		
	@Test(priority=1)
		public void testCase02() throws Exception
		{
			//TC logic
			//Enter from city name
			//driver.findElement(By.xpath("//input[@class='form-control pr-4']")).sendKeys("LAS");
			
			String fromCityName = "LAS";
			WebElement fromCity = driver.findElement(By.xpath("//input[@class='form-control pr-4']"));
			fromCity.sendKeys(fromCityName);
			System.out.println("From city is entered = " + fromCityName);
			
			Thread.sleep(2500);
			
			
		
			
			
			
			
			//Auto suggestion list - Handle
			List<WebElement> autoSuggestionList = driver.findElement(By.xpath("//ul[@class='suggestion-box__list']")).findElements(By.tagName("li"));
			System.out.println("Total suggestions are = " + autoSuggestionList.size());
			
			String cityNeedToSelect = "Spain";
		
			
			for(int i = 0; i<autoSuggestionList.size(); i++)
			{
				String citySuggestion = autoSuggestionList.get(i).getText();
				System.out.println(citySuggestion);    //syso and then press ctrl+space
				
				if(citySuggestion.contains(cityNeedToSelect))
				{
					autoSuggestionList.get(i).click();
					Thread.sleep(2000);
					break;
				}
				//String citySuggestion=autoSuggestion
				//if you want all shortcut list in eclipse then use
				//ctrl + shift +l
			}
			
			
			
			
			
			
			
			
		/*	String ToCityName1 = "DEL";
			WebElement ToCity1 = driver.findElement(By.xpath("//input[@class='form-control pr-4'][2]"));
			ToCity1.sendKeys(ToCityName1);
			System.out.println("To city is entered = " + ToCityName1);
			
			
			List<WebElement> autoSuggestionList1 = driver.findElement(By.xpath("//div[@class='suggestion-box__content is-visible']")).findElements(By.tagName("li"));
			System.out.println("Total suggestions are = " + autoSuggestionList1.size());
			
		*/	
			//Assignment - Pls do it for TO CITY
			
			
			
			//Select Date from cal
		}
		
		
		@Test(priority=2)
		public void toCity() throws InterruptedException
		{

			String ToCityName1 = "DEL";
			WebElement ToCity1 = driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[2]"));
			ToCity1.sendKeys(ToCityName1);
			System.out.println("To city is entered = " + ToCityName1);
			Thread.sleep(1000);
			
			List<WebElement> autoSuggestionList1 = driver.findElement(By.xpath("//div[@class='suggestion-box__content is-visible']")).findElements(By.tagName("li"));
			System.out.println("Total suggestions are = " + autoSuggestionList1.size());
			String cityNeedToSelect = "delhi";
			
			for(int i = 0; i<autoSuggestionList1.size(); i++)
			{
				String citySuggestion = autoSuggestionList1.get(i).getText();
				System.out.println(citySuggestion);    //syso and then press ctrl+space
				
				if(citySuggestion.contains(cityNeedToSelect))
				{
					autoSuggestionList1.get(i).click();
					Thread.sleep(2000);
					break;
				}
				//String citySuggestion=autoSuggestion
				//if you want all shortcut list in eclipse then use
				//ctrl + shift +l
			}
			
			
			
			
		}
		@AfterMethod
		public void closeBrowser() {
			driver.quit();	
		}
	}




