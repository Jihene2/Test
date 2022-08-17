package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) {
		
		
		
		 //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   	WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		  
		  
		 
		   //navigate
		    driver.navigate().to(" http://demo.guru99.com/test/newtours/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		    // click register    
            WebElement btn= driver.findElement(By.linkText("REGISTER"));
            btn.click();
		    driver.findElement(By.name("firstName")).sendKeys("jihene");
		    driver.findElement(By.name("lastName")).sendKeys("saidene");
		    driver.findElement(By.name("phone")).sendKeys("5200000");
		    driver.findElement(By.name("userName")).sendKeys("jihene.saidene@talan.com");
		    driver.findElement(By.name("city")).sendKeys("tunis");
		    driver.findElement(By.name("state")).sendKeys("tunis");
		    driver.findElement(By.name("postalCode")).sendKeys("2050");
		    driver.findElement(By.name("country")).sendKeys("TUNISIA");
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.name("confirmPassword")).sendKeys("123");
		    driver.findElement(By.name("submit")).click();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		    
		    
		    driver.close();

	}

}
