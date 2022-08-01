package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
