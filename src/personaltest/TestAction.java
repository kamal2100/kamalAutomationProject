package personaltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basepack.Baseclass;



public class TestAction extends Baseclass
{
	@Test
	public void loginpage()
	{
		//launch url
		driver.get("https://www.naukri.com/");
		WebElement signup=driver.findElement(By.xpath("(//*[@class='mTxt'])[9]"));
		Actions act=new Actions(driver);
		act.moveToElement(signup);
		act.build().perform();
		
		//click on 
		//driver.findElement(By.xpath("//*[@title='Buy online']"));
		try {
			
		WebElement login=driver.findElement(By.xpath("(//*[@title='Buy online'])"));
	login.click();
	//WebElement login1=driver.findElement(By.xpath(""))
		System.out.println("run sucessfully");
		
		}
		catch(Exception e)
		{
			System.out.println("click is not perform");
		}
	}

}


