package personaltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basepack.Baseclass;

public class Recruterinnaukri extends Baseclass
{
	@Test
	public void recruitment()

	{
		//launch URL
		driver.get("https://www.naukri.com/");
		//move on recruiters
		WebElement recruiters=driver.findElement(By.xpath("(//a[@title='Search Recruiters'])"));
		
		Actions rec1=new Actions(driver);
		rec1.moveToElement(recruiters);
		rec1.build().perform();
		
		
		//click on Browser all recruiters
		try {
		
		WebElement allrecruiter=driver.findElement(By.xpath("(//a[@title='Browse All Recruiters'])"));
		Thread.sleep(1000);
		allrecruiter.click();
		System.out.println("run sucessfully");
		//String newurl=driver.getPageSource();
		//System.out.println("new URL: " +newurl);
		}
		catch(Exception e)
		{
			System.out.println("not sucessful");
		}
		
		
		
		
	}
	

	
}
