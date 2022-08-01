package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch_using_xpath_2slas_div_at_class_equalto_value_slash_div_or_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		//  //tagname[@attribute='value']/tagname   absolute( direct )xpath method
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("www.besanttechnology.com");

	}

}
