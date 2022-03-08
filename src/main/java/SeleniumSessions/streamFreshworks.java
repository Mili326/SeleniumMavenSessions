package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class streamFreshworks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	
	
	/*	driver.findElements(By.cssSelector("ul.footer-nav li a"))
									.stream()
										.filter(ele-> !ele.getText().isEmpty())
											.forEach(ele -> System.out.println(ele.getText()));
	*/
		//sequential stream
		List <String> footerList=driver.findElements(By.cssSelector("ul.footer-nav li a"))
		.stream()
			.filter(ele-> !ele.getText().isEmpty())
			.map(ele->ele.getText())
			.collect(Collectors.toList());
		
		//footerList.stream().forEach(e->System.out.println(e));
	
	//Parallel stream
	
		footerList.parallelStream().forEach(e->System.out.println(e));
	}

}
