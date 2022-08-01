package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_css_tagname_attributr_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		//driver.manage().window().maximize(); //maximize web page
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.cssSelector("input#pass")).sendKeys("abcd@123");
        //driver.findElement(By.cssSelector("button#id")).click(); //here id value are continually changing so that we can't use id attribute
        //driver.findElement(By.linkText("Forgotten account")).click();
        driver.findElement(By.cssSelector("button[id='loginbutton']")).click();

	}

}
