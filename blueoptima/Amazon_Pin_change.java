package blueoptima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Pin_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"glow-ingress-line1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys("560029");
		driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input")).click();
		

	}

}
