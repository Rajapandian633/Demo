package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_automation_using_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\'nav-signin-tooltip\']/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("rpandian133@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Raja@6152");
		driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();
		


	}

}
