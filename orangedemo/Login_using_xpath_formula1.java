package orangedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Login_using_xpath_formula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.manage().window().maximize(); //maximize web page
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		//driver.findElement(By.xpath("//a[@href=\'/index.php/auth/requestPasswordResetCode\']")).click();
        if (driver.getTitle().equals("OrangeHRM"))
        {
        	System.out.println("Login Test Passed");
        }
        else
        {
         	System.out.println("login test is failed");
        }
        driver.quit();
	}

}
