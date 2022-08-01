package orangedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_xpath_formula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		//driver.findElement(By.cssSelector("input.form-hint")).sendKeys("Admin");
        //driver.findElement(By.cssSelector("input.txtPassword")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("input.button")).click();
		driver.findElement(By.cssSelector("input.Forgot your password?")).click();


	}

}
