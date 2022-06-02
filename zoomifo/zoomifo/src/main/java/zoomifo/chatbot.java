package zoomifo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chatbot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
				
				WebDriverManager.chromedriver().setup();
				   
			    //to handle notifications in websites
			    ChromeOptions options = new ChromeOptions();
			    options.addArguments("--disable-notifications");
			        
				ChromeDriver driver = new ChromeDriver(options);
				//Entering url
				driver.get("https://insent-recruitment.web.app/");
				//maximize the window
				driver.manage().window().maximize();
				
				//wiats
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				WebElement frame = driver.findElement(By.id("insent-iframe"));
				driver.switchTo().frame(frame);
				driver.findElement(By.id("insent-popup-content")).click();
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhavya@it.in");
				
				driver.findElement(By.xpath("//button[@class='sc-kpOJdX iEsgRA']")).click();
				//50-100
				driver.findElement(By.xpath("//div[@id='insent-buttons-message-button']")).click();
				//100-300
				
		       driver.findElement(By.xpath("//div[@id='insent-rating-card-rating-icon-container'][5]")).click();
		       driver.findElement(By.xpath("//button[@id='insent-message-input-buttons-wrapper']")).click();

			}

		}

		
		



