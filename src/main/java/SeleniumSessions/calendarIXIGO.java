package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendarIXIGO {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='c-input u-v-align-middle' and @placeholder='Depart']")).click();
		
		
		

	}

}
