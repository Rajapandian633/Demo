package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_xpath_2slash_tagname_at_attribute_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		
		// //tagname[@attribute='value'] xpath method
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcd@gmail.com");
		//driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("abcd");
		//driver.findElement(By.xpath("//input[@name='Login']")).click();
		//driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
				
		
		
		


	}

}
