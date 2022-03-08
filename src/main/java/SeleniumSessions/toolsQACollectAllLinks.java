package SeleniumSessions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolsQACollectAllLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		
		List<WebElement> linksList= driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());
		
	/*	for(int i=0;i <linksList.size();i++)
		{
			String text=linksList.get(i).getText();
			System.out.println(text);
		}
*/
		
//	Or
		Iterator<WebElement> it = linksList.iterator();

		while(it.hasNext()){

		String url = it.next().getAttribute("href");

		System.out.println(url);

		if(url == null || url.isEmpty()){
		System.out.println("URL is either not configured for anchor tag or it is empty");
		continue;
		}
}
}
}