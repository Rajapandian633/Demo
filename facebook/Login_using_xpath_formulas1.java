package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_xpath_formulas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		//driver.manage().window().maximize(); //maximize web page
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Admin");
        //driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//input[name=Forgotten password?']")).click();


	}

}
