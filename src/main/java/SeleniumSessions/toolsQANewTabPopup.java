package SeleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolsQANewTabPopup {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
	//	String oldTab = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		 
		ArrayList<String> newTab = new ArrayList<String> (driver.getWindowHandles());
		// newTab.remove(oldTab);
		
		 // change focus to new tab
		    driver.switchTo().window(newTab.get(1));
		   // System.out.println("New tab Title : " + driver.getTitle());
		   
		    System.out.println("Text in new Tab is Displayed : "+ driver.findElement(By.id("sampleHeading")).isDisplayed());
		   
		    driver.close();
		   
		 // change focus back to old tab
		    driver.switchTo().window(newTab.get(0));
		    
		    String title=driver.getTitle();
		    System.out.println("title of old tab : "+ title);
		
		
		
		
		
	}

}
