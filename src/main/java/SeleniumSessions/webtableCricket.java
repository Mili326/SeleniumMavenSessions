package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtableCricket {
	
	

							
	public static void main(String[] args) {
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.espncricinfo.com/series/west-indies-in-india-2021-22-1278661/india-vs-west-indies-3rd-odi-1278678/full-scorecard");
				driver.manage().window().maximize();
											
				getScoreCard(driver,"Shikhar Dhawan");
				getScoreCard(driver,"Prasidh Krishna");
				getScoreCard(driver,"Kuldeep Yadav");
	}
	
	public static void getScoreCard(WebDriver driver ,String name)
	{
		List<WebElement> scoreList=	driver.findElements(By.xpath("//a[contains(text(),'"+name+"')]//parent::td//following-sibling::td"));
		System.out.println(scoreList.size());
		for(int i=0; i< scoreList.size();i++)
		{
			System.out.print(scoreList.get(i).getText()+" "+"\t" + "\t");
		}

}
}
