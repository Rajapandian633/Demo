package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_css_tagname_slash_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		
		//tagname#id - css method
		
		//driver.findElement(By.cssSelector("input#username")).sendKeys("abcd@gmail.com");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("abcd");
		//driver.findElement(By.cssSelector("input#Login")).click();
		driver.findElement(By.cssSelector("a#forgot_password_link")).click();
						

	}

}
