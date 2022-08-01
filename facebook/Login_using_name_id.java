package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_name_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");System.out.println(driver.getTitle());
        driver.findElement(By.name("email")).sendKeys("rpandian133@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("selvi@6152");
		driver.findElement(By.name("login")).click();

	}

}
