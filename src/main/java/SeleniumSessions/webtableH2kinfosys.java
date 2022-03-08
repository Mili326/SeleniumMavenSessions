package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtableH2kinfosys {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		
		//No of columns
		List<WebElement> columns=driver.findElements(By.xpath("//*[@id='leftcontainer']//table//thead/tr/th"));
		int columnCount=columns.size();
		System.out.println(columnCount);
		
		//No of Rows
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='leftcontainer']//table//tbody//tr"));
		int rowCount=rows.size();
		System.out.println(rowCount);
		
		//Find second row content 
		WebElement secondRow=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[2]"));
		String secondRowText=secondRow.getText();
		System.out.println(secondRowText);
		
		//Find 2nd Row 2nd Column data
		
		WebElement secondRowsecondColumn=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[2]/td[2]"));
		String secondRowsecondColumnText= secondRowsecondColumn.getText();
		System.out.println("Cell Value is :" + secondRowsecondColumnText);
		
		
	}

}
