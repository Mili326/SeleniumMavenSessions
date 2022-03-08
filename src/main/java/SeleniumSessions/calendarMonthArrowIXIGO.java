package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendarMonthArrowIXIGO {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Select departure placeholder
		driver.findElement(By.xpath("//input[@placeholder='Depart' and @type='text']")).click();
		Thread.sleep(2000);
		
		//Select February month
		
		String startMonthValue= driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
		System.out.println(startMonthValue);
		
		while(!startMonthValue.equals("February 2022"))
					{
						driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
						startMonthValue=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
	
					}
		//Select date 
		List<WebElement> dateList=driver.findElements(By.xpath("//div[@class='rd-month'][1]//table//div[contains(@class,'day')]"));
		
		for(WebElement e:dateList)
		{
			String dateText=e.getText();
			if(dateText.equals("20")) {
				e.click();
			}else
			{
				System.out.println("Not clicked");
			}
							
		}
		Thread.sleep(2000);
		
		//Click on Return placeholder
		
			driver.findElement(By.xpath("//input[@placeholder='Return' and @type='text']")).click();
			Thread.sleep(2000);
				
			String endMonthValue=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[2]")).getText();
		
		while( !endMonthValue.equals("May 2022"))
		{
			driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
			endMonthValue=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[2]")).getText();
		}
		
List<WebElement> returndateList=driver.findElements(By.xpath("//div[@class='rd-month'][4]//table//div[contains(@class,'day')]"));
		
		for(WebElement e:returndateList)
		{
			String returndateText=e.getText();
			if(returndateText.equals("20")) {
				e.click();
			}else
			{
				System.out.println("Not clicked");
			}
							
		}
		

	}

}
