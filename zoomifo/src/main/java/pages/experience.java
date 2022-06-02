package pages;

import org.openqa.selenium.By;

import Baseclass.baseclass;

public class experience extends baseclass
{

	public Restartconservation rating()
	{
		
		 driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][5]")).click();
		  return new Restartconservation();
		  
	}

}
