package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_using_css_tagname_dot_classname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		
		//tagname.classname - css method
		
		driver.findElement(By.cssSelector("input.input.r4.wide.mb16.mt8.username")).sendKeys("abcd@gmail.com");
		driver.findElement(By.cssSelector("input.input.r4.wide.mb16.mt8.password")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input.button.r4.wide.primary")).click();
		//driver.findElement(By.cssSelector("a.fl.small")).click();
						

	}

}
