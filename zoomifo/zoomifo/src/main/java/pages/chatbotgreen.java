package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Baseclass.baseclass;

public class chatbotgreen extends baseclass {

	public Email green() {
		

		
		WebElement frame = driver.findElement(By.id("insent-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("insent-popup-content")).click();
	
		return new Email();
	}
		}

