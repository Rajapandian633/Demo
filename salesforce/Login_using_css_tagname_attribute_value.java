package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_css_tagname_attribute_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();    //maximize web page
		driver.get("https://login.salesforce.com/");
		
		System.out.println(driver.getTitle());
		
		//tagname[attribute='value'] css method
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		//driver.findElement(By.cssSelector("a[id='forgot_password_link']")).click();
				
				

	}

}
