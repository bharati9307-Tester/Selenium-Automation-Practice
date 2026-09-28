package Day23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssSelector {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	
	// tag id combination 
	//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("t-shirts");
	
	
	
	 
	
	//tg and attribute
	//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("t-shirts");
	
	//tag class and attribute
	//driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("t-shirts");
	
	
	}

}
