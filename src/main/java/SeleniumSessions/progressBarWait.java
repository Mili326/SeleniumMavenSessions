package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class progressBarWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/progress-bar");
		driver.manage().window().maximize();
		
		//click on start button
		driver.findElement(By.id("startStopButton")).click();
		
		//Progressbar element 
		WebElement progressbar=driver.findElement(By.xpath("//div[@id='progressBar']//div"));
		//Wait progressbar to be 100%
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		System.out.println(wait.until(ExpectedConditions.attributeContains(progressbar,"class", "progress-bar bg-success")));
		
		
	
			
		
		
		
		
	}

}
