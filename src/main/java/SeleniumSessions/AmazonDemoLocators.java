package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDemoLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://automationpractice.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  String title=driver.getTitle();
		  System.out.println(title);
		  driver.findElement(By.linkText("Sign in")).click();
		  driver.findElement(By.id("email_create")).sendKeys("abcd1diff@gmail.com");
		  driver.findElement(By.id("SubmitCreate")).click();
		  String loginTitle=  driver.getTitle();
		  System.out.println(loginTitle);
		  System.out.println(driver.findElement(By.xpath("//h1[text()='Create an account']")).getText());
		  System.out.println(driver.findElement(By.xpath("//h3[text()='Your personal information']")).getText());
		  System.out.println(driver.findElement(By.xpath("//label[text()='Title']")).getText());
		  driver.findElement(By.id("id_gender2")).click();
		  driver.findElement(By.id("customer_firstname")).sendKeys("Meghan");
		  driver.findElement(By.id("customer_lastname")).sendKeys("Sus");
		 // driver.findElement(By.id("email"))
		  driver.findElement(By.id("passwd")).sendKeys("Test12345");
		 
		  //dropdowns
		  WebElement days=driver.findElement(By.id("days"));
		  Select select =new Select(days);
		  select.selectByVisibleText("3  ");
		  
		  WebElement months =driver.findElement(By.id("months"));
		  Select select1 =new Select(months);
		  select1.selectByVisibleText("April ");
		  
		  WebElement years =driver.findElement(By.id("years"));
		  Select select2 =new Select(years);
		  select2.selectByVisibleText("1981  ");
		  
		  //Checkboxes
		  driver.findElement(By.id("newsletter")).click();
		  driver.findElement(By.id("optin")).click();
		  
		  //Presence of Your address text
		 System.out.println(driver.findElement(By.xpath("//h3[text()='Your address']")).isDisplayed());
		
		 
		  driver.findElement(By.id("firstname")).sendKeys("Meghan");
		  driver.findElement(By.id("lastname")).sendKeys("Sus");
		  driver.findElement(By.id("company")).sendKeys("ABC");
		  driver.findElement(By.id("address1")).sendKeys("2300Katrina lane");
		  driver.findElement(By.id("address2")).sendKeys("Apt 12222");
		  driver.findElement(By.id("city")).sendKeys("Plano");;
		  
		  //dropdown
		 WebElement state= driver.findElement(By.id("id_state"));
		 Select select3=new Select(state);
		 select3.selectByVisibleText("Texas");
		 
		 driver.findElement(By.id("postcode")).sendKeys("75025");
		 
		WebElement country= driver.findElement(By.id("id_country"));
		Select select4=new Select(country);
		select4.selectByVisibleText("United States");
		
		driver.findElement(By.id("other")).sendKeys("TextArea");
		driver.findElement(By.id("phone")).sendKeys("123456789");
		driver.findElement(By.id("phone_mobile")).sendKeys("987654321");
		driver.findElement(By.id("alias")).sendKeys("TestAddress");
		  
		  driver.findElement(By.xpath("//button[@id='submitAccount']//span[text()='Register']")).click();
		  
		  
		  
	}

}
