package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableToolsQa {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		List<WebElement> gainers= driver.findElements(By.xpath("//div[@class='rt-td']//parent::div[@class='rt-tr -odd']//following-sibling::div[@class='rt-td']"));
	    System.out.println(gainers.size());
		
		for(int i=0; i<gainers.size(); i++){
			
			System.out.print(gainers.get(i).getText()+" "+"\t" + "\t");
			
		}

}
}
