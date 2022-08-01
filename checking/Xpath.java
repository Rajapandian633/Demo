package checking;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("abcd123@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("abc");
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
		
	}

}
