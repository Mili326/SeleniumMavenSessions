package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolsQAWindowPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		driver.findElement(By.id("windowButton")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
				String parentwindowId =	it.next();
				String childWindowId  = it.next();
				//switch to new window
				driver.switchTo().window(childWindowId);
				System.out.println("New Window Text displayed : " + driver.findElement(By.id("sampleHeading")).isDisplayed());
				driver.close();
				
				//switch to parent window
				driver.switchTo().window(parentwindowId);
				System.out.println(driver.getTitle());
				driver.close();
				
				
		
		
		
	}

}
