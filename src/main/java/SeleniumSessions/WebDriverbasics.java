package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverbasics {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		String title=driver.getTitle();
		System.out.println("Title of browser : "+ " " + title);
		 if(title.equalsIgnoreCase("google"))
		 {
			 System.out.println("Correct title");
		 }
		 else {
			 System.out.println("Incorrect title");
		 }
		System.out.println("Current URL:"+" " + driver.getCurrentUrl());
		
		driver.quit();//close the browser  (session id null)
	//	driver.close();//close the browser (invalid/expired session , session remains same)
		 
	}

}
