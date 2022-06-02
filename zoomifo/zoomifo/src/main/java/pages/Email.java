package pages;

import org.openqa.selenium.By;


import Baseclass.baseclass;



	
	
	
	public class Email extends baseclass {

		public colleague email() {
			

			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhavya@it.in");
			return new colleague() ;
		}
			}
