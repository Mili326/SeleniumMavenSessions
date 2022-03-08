package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerToolsQA {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
    	driver.findElement(By.xpath("(//div[@class='react-datepicker__input-container'])[1]")).click();
			
	//	selectDate("12");
	//	selectDateandTime("22", "10:00");
		
	   List<WebElement> dateList =driver.findElements(By.xpath("//*[@class='react-datepicker__week']//div[contains(@class,'react-datepicker__day react-datepicker__day')]"));
	   System.out.println("List size :" + dateList.size());// list size =0 ????
	  for(WebElement e:dateList)
	  {
		  	String date=e.getText();
		  		System.out.println(date);
		  //	if(date.equals("20")) {
		//	   						e.click();
			   						break;
		 //  						}
			
	  }
	
		
	}
	public static void selectDate(String day)
	{
		driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day') and text()='"+day+"']")).click();
	}
	
	public static void selectDateandTime(String date,String time) throws InterruptedException
	{
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--0"+date+"']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='react-datepicker__time-box']/ul/li[@class='react-datepicker__time-list-item ' and text()='"+time+"']")).click();
	}  
	

}
