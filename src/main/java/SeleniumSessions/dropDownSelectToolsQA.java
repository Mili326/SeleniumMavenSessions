package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownSelectToolsQA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	
		//1.Dopdown With Select class	
	/*	Select select=new Select(driver.findElement(By.id("oldSelectMenu")));
		List<WebElement> selectMenu= select.getOptions();
		System.out.println(selectMenu.size());
		for(int i=0; i<selectMenu.size(); i++) {
			String options= selectMenu.get(i).getText();
			System.out.println(options);
			
			if(options.equals("Yellow"))
			{
				selectMenu.get(i).click();
				break;
			}
		}
	*/	
		
		//2.Without Select class
		List<WebElement>  selectValue =  driver.findElements(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]"));
		
		System.out.println(selectValue.size());
		
		for(int i=0; i<selectValue.size(); i++) {
			String options= selectValue.get(i).getText();
			System.out.println(options);
			
		
	}

	}
}
