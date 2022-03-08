package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sliderToolsQA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		
		WebElement slider=driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
		Actions act=new Actions(driver);
		act.moveToElement(slider, 50, 0).perform();
		slider.click();
		

	}

}
