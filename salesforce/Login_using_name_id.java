package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_name_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		//driver.findElement(By.name("username")).sendKeys("abcd123@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("abc");
		//driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Forgot Your Password?")).click();


	}

}
