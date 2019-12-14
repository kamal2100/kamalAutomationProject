package personaltest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basepack.Baseclass1;



public class TestCalender extends Baseclass1
{
	
	@Test
	public void calander()
	{
		driver.get("https://www.cheapoair.com/");
		String a = "//div[@class='calendar__single-month active']/div[3]/div[";
		  int k = 1;
		  String b = "]/div";
		  String xp = a + k + b;
		  String dateNeedToSelect = "30";
		  
		  for(k = 1; k<=42; k++)
		  {
			  xp = a + k + b;
			  
			  try
			  {
				  String dateInCal = driver.findElement(By.xpath(xp)).getText();
				  System.out.println(dateInCal);
				  
				  if(dateInCal.equals(dateNeedToSelect)) 
				  {
					  driver.findElement(By.xpath(xp)).click();
					  break;
				  }
			  }
			  catch(Exception ex)
			  {
				  System.out.println("No date is present for xpath = " + xp);
			  }
		
		
	}

	}
}
