package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoCompleteText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/auto-complete");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		//Select the Textbox and send text 
		WebElement box=	driver.findElement(By.xpath("//*[@class='auto-complete__value-container css-1hwfws3']"));
		
		act.click(box).sendKeys("r");
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
	//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
