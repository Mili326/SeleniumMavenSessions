package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoQAWebtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.w3schools.com/html/html_tables.asp");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	      String title=driver.getTitle();
		  System.out.println(title);
		 
		//Get first row column valuesin webtable
		  
		  /*
		    //*[@id="customers"]/tbody/tr[2]/td[1]
		   
		  	//*[@id="customers"]/tbody/tr[3]/td[1]
		  	//*[@id="customers"]/tbody/tr[4]/td[1]
         */
 	  
		  int rowCount= driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
		  
		  String beforeXpath="//*[@id='customers']/tbody/tr[";
		  String afterXpath="]/td[1]";
		  
		  for(int i=2; i<=rowCount+1; i++)
		  {
			  String actualXpath=beforeXpath + i + afterXpath;
			 // System.out.println(actualXpath);
			 String value= driver.findElement(By.xpath(actualXpath)).getText();
			 System.out.println(value);
			 
			 		 
		  }
		  
		  
		  
		  
	}
}
