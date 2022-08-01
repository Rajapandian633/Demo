package blueoptima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Amazon_language {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\edge driver\\msedgedriver.exe"); 
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'nav-signin-tooltip\']/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("rpandian133@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Raja@6152");
		driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", ""); 
		driver.findElement(By.xpath("//*[@id=\"icp-touch-link-language\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[4]/div/label/i")).click();
		driver.findElement(By.xpath("//*[@id=\"icp-save-button\"]/span/input")).click();
	}

}
