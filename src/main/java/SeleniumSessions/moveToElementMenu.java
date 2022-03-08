package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moveToElementMenu {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		
		WebElement menu=driver.findElement(By.xpath("//div[@class='row']//div[2]//div//ul//li[2]//a[text()='Main Item 2']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(menu).build().perform();
		
	//	driver.findElement(By.xpath("//*[@id='nav']//li[2]//ul//li[1]//a")).click();
	//	driver.findElement(By.xpath("//*[@id='nav']//li[2]//ul//li[2]//a")).click();
		
		//Click Sub Sub List
		driver.findElement(By.xpath("//*[@id='nav']//li[2]//ul//li[3]//a")).click();
		
	//Move to SubList1
	//	WebElement subsubItem1list1=driver.findElement(By.xpath("//*[@id='nav']//li[2]//ul//li[3]//ul//li[1]//a"));
		
	//	act.moveToElement(subsubItem1list1).build().perform();
		
		//Move to SubList2
		WebElement subsubItem1list2=driver.findElement(By.xpath("//*[@id='nav']//li[2]//ul//li[3]//ul//li[2]//a"));
		act.moveToElement(subsubItem1list2).build().perform();
	}

}
