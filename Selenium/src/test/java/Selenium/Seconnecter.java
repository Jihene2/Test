package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seconnecter {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		  
		  
		 
		  //navigate
		    driver.navigate().to(" http://demo.guru99.com/test/newtours/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
           // click 
            WebElement btn= driver.findElement(By.linkText("SIGN-ON"));
            btn.click();
            driver.findElement(By.name("userName")).sendKeys("jihene");
            driver.findElement(By.name("password")).sendKeys("123");
            driver.findElement(By.name("submit")).click();
            
            driver.close();
	}

}
