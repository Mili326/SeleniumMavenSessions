package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hubSpotLocators {

	public static void main(String[] args) throws InterruptedException {
		
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://app.hubspot.com");
      driver.manage().window().maximize();
      Thread.sleep(50000);
      driver.findElement(By.id("username")).sendKeys("mrinalini326@gmail.com");
      driver.findElement(By.id("password")).sendKeys("MiniIndia123$");
      driver.findElement(By.id("loginBtn")).click();
    		  
      
      

	}

}
