package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsToolsQA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement doubleClickBtn=driver.findElement(By.id("doubleClickBtn"));
		
		Actions act =new Actions(driver);
		act.doubleClick(doubleClickBtn).build().perform();
		
		WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightClickBtn).build().perform();
		
		//Not working
	//	WebElement clickBtn=driver.findElement(By.xpath("//button[@id='hK1tE']"));
	//	clickBtn.click();
		

	}

}
