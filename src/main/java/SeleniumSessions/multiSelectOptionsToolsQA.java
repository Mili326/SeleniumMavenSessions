package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiSelectOptionsToolsQA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		 Select select = new Select(driver.findElement(By.id("cars")));
		//Get all options 
		List<WebElement> carOptions=select.getOptions();
		for(int i=0; i<carOptions.size(); i++)
		{
			String text=carOptions.get(i).getText();
			System.out.println(text);
		}
		//Using isMultiple() method to verify if the element is multi-select, if yes go onto next steps else eit
        if(select.isMultiple()){
        	 //Selecting option as 'Opel'-- ByIndex
            	System.out.println("Select option Opel by Index");
            	select.selectByIndex(2);
            	
            //Selecting the option as 'Saab'-- ByValue
                System.out.println("Select option saab by Value");
                select.selectByValue("saab");
             
            // Selecting the option by text
                System.out.println("Select option Audi by Text");
                select.selectByVisibleText("Audi");
             
                //Get the list of selected options
                System.out.println("The selected values in the dropdown options are -");

                List<WebElement> selectedOptions = select.getAllSelectedOptions();

                for(WebElement selectedOption: selectedOptions)
                    System.out.println(selectedOption.getText());
        }
		
		
		
		
	}

}
