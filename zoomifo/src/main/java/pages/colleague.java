package pages;

import org.openqa.selenium.By;

import Baseclass.baseclass;

public class colleague extends baseclass 
{
	

	public experience number()
	{
		
	driver.findElement(By.xpath("//button[@class='sc-kpOJdX iEsgRA']")).click();
	//50-100
	driver.findElement(By.xpath("//div[@id='insent-buttons-message-button']")).click();
	//100-300
	return new experience();
	
}
}
