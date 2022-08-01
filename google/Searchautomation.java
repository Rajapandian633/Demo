package google;

import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.index.qual.SearchIndexBottom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("besanttechnology");
		
		//driver.get("https://www.besanttechnologies.com/home-page");
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		
		
		

	}

}
