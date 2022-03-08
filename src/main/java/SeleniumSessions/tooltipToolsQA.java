package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tooltipToolsQA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		
		WebElement tootipButton=driver.findElement(By.id("toolTipButton"));
		Actions act=new Actions(driver);
		act.moveToElement(tootipButton).build().perform();
		
		String tooltip=tootipButton.getText();
		System.out.println("ToolTip Button ToolTip: "+ tooltip);
		
		WebElement textfield=driver.findElement(By.id("toolTipTextField"));
		act.moveToElement(textfield).build().perform();
		
		//There is no text 
		String toolTiptext=textfield.getText();
		System.out.println("ToolTipTextField: " + toolTiptext);//no output coz there's no text
		
		
	}

}
