package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("messageWindowButton")).click();
		
		String parentHandle= driver.getWindowHandle();
		
		//Get all the unique windowhandles in a set and iterate
		Set<String> windowhandles= driver.getWindowHandles();
		Iterator<String> it=windowhandles.iterator();
		
		//Iterate the New Windows 
		while(it.hasNext())
		{
		String childWindowHandle =(String) it.next();
		//Till parent window is not equal to child window swicth to child window, perform action
		if(!parentHandle .equals(childWindowHandle))
		{
			driver.switchTo().window(childWindowHandle);
		//	System.out.println(driver.switchTo().window(childWindowHandle).getTitle());
			driver.close();
		}
			
		}
		driver.switchTo().window(parentHandle);
		
		
		
	}

}
