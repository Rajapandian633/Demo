package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_xpath_2slash_tagname_atcontains_atribute_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//  //tagname[contains(@attribute,'value')] xpath relative expressions method using contains
		
		driver.get("https://login.salesforce.com/"); 
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("abcd@gmail.com");
		//driver.findElement(By.xpath("//input[contains(@name,'pw')]")).sendKeys("abcd");
		//driver.findElement(By.xpath("//input[contains(@name,'Login')]")).click();
		driver.findElement(By.xpath("//a[contains(@id,'forgot_password_link')]")).click();

	}

}
