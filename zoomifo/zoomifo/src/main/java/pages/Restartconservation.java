package pages;

import org.openqa.selenium.By;

import Baseclass.baseclass;

public class Restartconservation extends baseclass{

	
public Restartconservation restart () {
	


		 driver.findElement(By.xpath("//button[@id='insent-message-input-buttons-wrapper']")).click();
      return this;
      
	}

}
