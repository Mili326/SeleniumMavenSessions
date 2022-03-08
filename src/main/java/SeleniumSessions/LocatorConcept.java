package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/mini/ChromeDriver setup/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();;
		System.out.println("Title of page :" + " " + driver.getTitle());
		driver.findElement(By.id("input-firstname")).sendKeys("Mili1");
		driver.findElement(By.id("input-lastname")).sendKeys("angel1");
		driver.findElement(By.id("input-email")).sendKeys("mrinalinisharma3261@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("123456789");
		driver.findElement(By.id("input-password")).sendKeys("123456789");
		driver.findElement(By.id("input-confirm")).sendKeys("123456789");
		driver.findElement(By.name("newsletter")).click();
		
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();;
	}

}
