package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tabsToolsQA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tabs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//get list of tabs 
		List<WebElement> tabs=driver.findElements(By.xpath("//*[@class='nav nav-tabs']"));
		System.out.println(tabs.size());
		for(int i=0; i < tabs.size(); i++)
		{
			tabs.get(i).click();
			
			
			//get list of tab links	
				List<WebElement> tabLinkList =driver.findElements(By.xpath("//nav[@class='nav nav-tabs']//a"));
						System.out.println(tabLinkList.size());
		
						for(int k=0; k< tabLinkList.size(); k++)
						{
							System.out.println("Tab " + k+ ":"+tabLinkList.get(k).getText());
							System.out.println(driver.findElement(By.xpath("//div[@class='tab-content']//div//p")).getText());
				
						}
						
					//	System.out.println(driver.findElement(By.xpath("//nav[@class='nav nav-tabs']//a")).getText());
					//	System.out.println(driver.findElement(By.xpath("//div[@class='tab-content']//div//p")).getText());
		
		
	}
	}
}

