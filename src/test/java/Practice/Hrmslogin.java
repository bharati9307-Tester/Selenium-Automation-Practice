package Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrmslogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("http://210.89.42.215:8080/hrms/login/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("PLS@Admin");
		d.findElement(By.xpath("//input[@id='loginpass']")).sendKeys("Pass@123");
		d.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(2000);
		WebElement element1=d.findElement(By.xpath("//a[@id='pmodule_201.00']//i[@class='fa fa-money']"));
		((JavascriptExecutor)d).executeScript("arguments[0].click();",element1);
		WebElement element2=d.findElement(By.xpath("//a[@id='pmenuLink_57.01.00.00']"));
		((JavascriptExecutor)d).executeScript("arguments[0].click();",element2);
		d.findElement(By.xpath("//a[normalize-space()='Add']")).click();
		d.findElement(By.xpath("//a[@id='menuLink_57.02.01.00']")).click();
	}

}
