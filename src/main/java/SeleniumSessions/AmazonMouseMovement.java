package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMouseMovement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://automationpractice.com");
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	     System.out.println(driver.getTitle());
	      String logo= driver.findElement(By.xpath("//a//img[@class='logo img-responsive']")).getText();
	      System.out.println("Logo" + logo);
	     //select Women tab
	      Actions action=new Actions(driver);
	      WebElement women=driver.findElement(By.xpath("//a[text()='Women' and @class='sf-with-ul']"));
	      action.moveToElement(women).build().perform();
	      System.out.println("after clicking Women tab " + driver.getTitle());
	      
	      //Select Tops
	      driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/a")).click();
	      System.out.println("After Tops tab :" + driver.getTitle());
	      
	     // driver.findElement(By.xpath("//ul//li//a[text()='Women']")).click();
	      	driver.navigate().back();
	      	System.out.println("Going back: " + driver.getTitle());
	      	driver.navigate().forward();
	      	System.out.println("Going Forward: " + driver.getTitle());
	}

}
