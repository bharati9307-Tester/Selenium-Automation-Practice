package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(5000);
		boolean status=driver.findElement(By.xpath("//div[@class='cart_item']")).isDisplayed();
		System.out.println("verification of product present in add to cart:"+status);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
		//WebElement empty=driver.findElement(By.xpath("//div[@class='cart_list']"));
		//if(empty
	}
}
