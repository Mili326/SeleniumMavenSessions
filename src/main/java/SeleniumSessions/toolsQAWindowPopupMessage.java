package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolsQAWindowPopupMessage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		//Click on New Window Message button
		driver.findElement(By.id("messageWindowButton")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
				String parentWindowId= 	it.next();
				System.out.println("Parent Window Id : "+ parentWindowId);
				String childWindowId= 	it.next();
				System.out.println("Child WindowId : " + childWindowId);
				
				 driver.switchTo().window(childWindowId);
				 
				System.out.println(driver.findElement(By.xpath("//body[text(),'Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.']")).isDisplayed());
				
		

	}

}
