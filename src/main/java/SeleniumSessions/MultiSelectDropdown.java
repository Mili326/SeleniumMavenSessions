package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropdown {
	
	//Without Select Class
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(20);
		System.out.println(driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-12']//p//b[text()='Multiselect drop down']")).isDisplayed());
		
		//click the MultiSelect dropdown
			driver.findElement(By.xpath("//*[@id='selectMenuContainer']//div[7]//div[@class='col-md-6 col-sm-12']//div//div")).click();
		
			//call the function to select choices
			selectChoiceValues(driver,"All");
	 
	}
			//Array of values
		public static void selectChoiceValues(WebDriver driver, String... value){
			
		 
				List<WebElement> multiSelect= driver.findElements(By.xpath("//*[@id='selectMenuContainer']//div[7]//div//div//div//div//div//div[@class='css-12jo7m5']"));
		if(!value[0].equalsIgnoreCase("All")) {
				for(int i=0; i<multiSelect.size(); i++) {
					String text=multiSelect.get(i).getText();
					System.out.println(text);
			
					for(int k=0; k<value.length; k++) {
					if(text.equals(value))
					{
						multiSelect.get(i).click();
						break;
					}
					}
				}
		}
				else {
					try {
						for(int all=0; all< multiSelect.size(); all++)
						{
							multiSelect.get(all).click();
						}
						}
					catch(Exception e)
					{
						
					}
		}
		
	}
}



