package pages;

import org.openqa.selenium.By;

import Baseclass.baseclass;

public class Restartconservation extends baseclass{

	
public Restartconservation ()
{

		 driver.findElement(By.xpath("//button[@id='insent-message-input-buttons-wrapper']")).click();
      return;
      
	}

}
