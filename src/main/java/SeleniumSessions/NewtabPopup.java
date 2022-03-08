package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewtabPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
	//Click on Button and get windowhandles for bot tabs and Iterate
		driver.findElement(By.id("tabButton")).click();
		Set<String> tabs=driver.getWindowHandles();
		Iterator<String> it= tabs.iterator();
		
				String parentWindowId = it.next();
				String childWindowId  = it.next();
				driver.switchTo().window(childWindowId);
				driver.manage().window().maximize();
				System.out.println(driver.findElement(By.id("sampleHeading")).isDisplayed());
				
				// change focus back to old tab
			    driver.switchTo().window(parentWindowId);
			    
			    String title=driver.getTitle();
			    System.out.println("title of old tab : "+ title);
				
	}

}
