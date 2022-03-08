package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtableRediff {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/group");
		driver.manage().window().maximize();
		
		List<WebElement> gainers= driver.findElements(By.xpath("//a[contains(text(),'A Infrastructure')]//parent::td//following-sibling::td"));
	    System.out.println(gainers.size());
		
		for(int i=0; i<gainers.size(); i++){
			
			System.out.print(gainers.get(i).getText()+" "+"\t" + "\t");
			
		}
		
		
		

	}

}
