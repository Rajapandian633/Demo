package orangedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_css_formulas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		//driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
        //driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("input[name='Submit']")).click();
		driver.findElement(By.cssSelector("a[href=\'/index.php/auth/requestPasswordResetCode\']")).click();


	}

}
