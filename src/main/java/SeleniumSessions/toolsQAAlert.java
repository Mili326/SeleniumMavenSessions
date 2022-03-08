package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolsQAAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
	/*	System.out.println(driver.findElement(By.xpath("//span[text()='Click Button to see alert ']")).isDisplayed());
		// 1 .Javascript Alert
		//Click on button
		driver.findElement(By.xpath("//button[text()='Click me']")).click();
		
		//Switch to alert
		Alert alert=driver.switchTo().alert();
		
		//Get text from Alert and validate
		String alertText=alert.getText();
		System.out.println(alertText);
	/*	if(alertText.equals("You clicked a button"))
		{
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
		}
       
		alert.accept();
	*/	
		
/*		//2.Javascript Alert with wait time
		System.out.println(driver.findElement(By.xpath("//span[text()='On button click, alert will appear after 5 seconds ']")).isDisplayed());
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(5000);
		
		Alert alert1=driver.switchTo().alert();
		String text=alert1.getText();
		System.out.println(text);
		alert.accept();
		
		//3.Confirm 
		System.out.println(driver.findElement(By.xpath("//span[text()='On button click, confirm box will appear']")).isDisplayed());
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert alert2=driver.switchTo().alert();
		String text1 = alert2.getText();
		System.out.println("Alert text: "+ text1);
		
		//alert.accept();
		alert2.dismiss();
	*/	
		//prompt alert-sendkeys
		System.out.println(driver.findElement(By.xpath("//span[text()='On button click, prompt box will appear']")).isDisplayed());
		
		driver.findElement(By.id("promtButton")).click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("Test123");
		
		
		String text2=alert3.getText();
		System.out.println("Prompt alert text: "+text2);
		
		alert3.sendKeys("Test123");
		
		alert3.accept();
		
		
		
	}

}
