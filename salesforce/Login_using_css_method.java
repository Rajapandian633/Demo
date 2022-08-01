package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_css_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		//driver.findElement(By.cssSelector("input#username.input.r4.wide.mb16.mt8.username")).sendKeys("Admin");
		//driver.findElement(By.cssSelector("input#password.r4.wide.mb16.password")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
		driver.findElement(By.cssSelector("a#forgot_password_link.fl.small")).click();

	}

}
