package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepickerIXIGO {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
		//Click on Departure placeholder
			driver.findElement(By.xpath("//input[@placeholder='Depart' and @type='text']")).click();
			//Select date
		//	driver.findElement(By.xpath("//div[@class='day has-info' and text()='16']")).click();
		
		//get list of dates from calendar and get thier text and then match with tobeclicked value:
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='rd-month'][1]//table//div[contains(@class,'day')]"));
		System.out.println(dates.size());
		for(WebElement e:dates)
		{
			String datesList=e.getText();
			//System.out.println(datesList);
		
				Actions act=new Actions(driver);
			
			if(datesList.equals("20"))
			{ 
				 act.click(e).build().perform();
				//e.click();
			}
			else {
				System.out.println("Not clicked");
				break;
				}
		}
		
		//Click on Return placeholder
	//	driver.findElement(By.xpath("//input[@placeholder='Return' and @type='text']")).click();
		//Select date
	//	driver.findElement(By.xpath("//div[@class='day has-info' and text()='16']")).click();
		
		
	//	Click on arrow
	//    driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
	//    driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
	  //Select May4 
	//    driver.findElement(By.xpath("//div[@class='day has-info' and text()='4']")).click();
	
	}

}
