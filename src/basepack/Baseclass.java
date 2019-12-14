package basepack;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class Baseclass {

		protected WebDriver driver;
		
		@BeforeMethod
		public void openBrowser() {
			String projectPath = System.getProperty("user.dir");
			System.out.println("Projejct Path is = " + projectPath);
			
			String browserDriverPath = projectPath + "\\browser_Drivers\\chromedriver.exe";
			System.out.println("Browser Driver exe path = " + browserDriverPath);
			
			System.setProperty("webdriver.chrome.driver", browserDriverPath);
			driver = new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			//Cookies
			/*
			 * driver.manage().deleteAllCookies();
			 * 
			 * driver.navigate().
			 */
			
		}
		
		@AfterMethod
		public void quitBrowser() {
			//driver.quit();
		}
	}



