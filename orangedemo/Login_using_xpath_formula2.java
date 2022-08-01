package orangedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_xpath_formula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		//driver.findElement(By.cssSelector("input#Username")).sendKeys("abcd@gmail.com");
        //driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("abcd@123");
        //driver.findElement(By.cssSelector("input#btnLogin")).click();
        driver.findElement(By.cssSelector("a#Forgot your password?"));

		
	}

}
