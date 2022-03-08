package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggestionTextbox {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='yschsp']")).sendKeys("Selenium");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sbq-wrap']/div/div/div/ul/li")));
		
		List<WebElement> suggestedList =driver.findElements(By.xpath("//*[@id='sbq-wrap']/div/div/div/ul/li"));
		
 		System.out.println("AutoSuggested List :"+ suggestedList.size() );
 		for(int i=0; i< suggestedList.size(); i++)
 		{
 			System.out.println(suggestedList.get(i).getText());
 			if(suggestedList.get(i).getText().equals("selenium interview questions"))
 			{
 				suggestedList.get(i).click();
 				
 			}
 		}
		
		
		
		
	}

}
