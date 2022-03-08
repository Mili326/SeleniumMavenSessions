package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameToolsQA {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		WebElement frameElement1 =driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameElement1);
		System.out.println(driver.findElement(By.id("sampleHeading")).isDisplayed());
		
		WebElement frameElement2 =driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frameElement2);
		
		System.out.println(driver.findElement(By.id("sampleHeading")).isDisplayed());
		
		

	}

}
