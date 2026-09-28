package Day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	
	// name locator
	//driver.findElement(By.name("viewport")).sendKeys("title");
	
	// id locator
	//boolean displayedstatus =driver.findElement(By.id("container")).isDisplayed();
	//System.out.println(displayedstatus);
	
	
	//linktext and partial link text locators
	//driver.findElement(By.linkText("Forgot user ID or password?")).click();
	//driver.findElement(By.partialLinkText("Forgot")).click();// write a some part of linktext

	
	//class name locators
	//List<WebElement>headerLinks=driver.findElements(By.className("list inline items"));
	//System.out.println("total number of header links :"+headerLinks.size());
	;
	
	//tag name
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println("total no o0f links:"+links.size());
	List<WebElement>image=driver.findElements(By.tagName("img"));
	System.out.println("total no of images:"+image.size());
	}

	
	}


