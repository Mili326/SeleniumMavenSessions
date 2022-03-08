package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class accordianToolsQA {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/accordian");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='card-header']"));
		System.out.println(links.size());
		
		//Can use Actions class also , else simple element click will also work
		Actions act=new Actions(driver);
		
			
			for(WebElement w : links)
				act.click(w).build().perform();
			
				//links.get(i).click();
			for(int i=0; i< links.size(); i++)
			{
				System.out.println("Link "+ i+ " : " + links.get(i).getText());
				System.out.println(driver.findElement(By.xpath("//div[@class='card']//div//div//p")).getText());
				
				
				List<WebElement> paragraph=driver.findElements(By.xpath("//div[@class='card']//div//div//p"));
				System.out.println(paragraph.size());
				for(int k=0; k< paragraph.size(); k++) {
				System.out.println("paragraph : "+ k + paragraph.get(k).getText());
				//	System.out.println(driver.findElement(By.xpath("//div[@class='card']//div//div//p[3]")).getText());
				}
				
		}
				
	}
	
}
	


