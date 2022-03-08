package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paginationCRMPRO {

	static WebDriver driver;
	
	public static void	selectContact(String name)
	{
		WebElement e=driver.findElement(By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td//div//label"));
		Actions act = new Actions(driver);
		act.click(e).build().perform();
	}
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/contacts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mrinalini326@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("India123$");
			driver.findElement(By.xpath("//div[text()='Login']")).click();
			driver.findElement(By.xpath("//span[text()='Contacts']")).click();
			
			
			List<WebElement> pages=driver.findElements(By.xpath("//div[@class='ui right floated pagination menu custom-pagination']//a"));
			
			int i=0;
			while(true)
			{
				if(driver.findElements(By.linkText("Ali")).size()==1)
				{
					selectContact("Ali");
					break;
				}
				else {
					try {
							pages.get(i).click();
					}
					catch(Exception e)
					{		
						System.out.println("pagination over...");
						
					}
					driver.findElements(By.xpath("//div[@class='ui right floated pagination menu custom-pagination']//a"));
					i++;
				}
			}
			
			
	}

}
