package SeleniumSessions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


//Signup page 

public class spicejetLocators {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.spicejet.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	      //Click on Signup Link
	      driver.findElement(By.xpath("//div[contains(text(),'Signup')]")).click();
	     
         
	   //Dropdown for Title
	   //css-76zvg2 r-qsz3a2 r-ubezar r-ymttw5 r-1w50u8q---Mr,Mrs,Miss
	    // Not able to click the dropdown options since the page has same xpath[class] for all options , 
	      
	    List<WebElement> titleList = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//div[@class='css-76zvg2 r-qsz3a2 r-ubezar r-ymttw5 r-1w50u8q']"));
	    System.out.println(titleList.size());
	           
	    for(int i=0;i<titleList.size();i++)
	    {
	    	System.out.println(titleList.get(i).getText());
	    }
	    
	    //  System.out.println(driver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).isSelected());
	    
	   driver.findElement(By.xpath("//*[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-10paoce r-ymttw5 r-1w50u8q r-19hjvk6']")).sendKeys("A");
	   // driver.findElement(By.xpath("//*[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-10paoce r-ymttw5 r-1w50u8q r-19hjvk6']")).sendKeys("sharma");
	   //Not able to distinguish input Textboxes  xpath based on same class atribute 		
	}
}
