package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentno1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		//List<WebElement>links=driver.findElements(By.tagName("a"));
		//System.out.println("total no o0f links:"+links.size());
		//List<WebElement>image=driver.findElements(By.tagName("img"));
		//System.out.println("total no of images:"+image.size());
		 driver.findElement( By.linkText("navbar-brand")).click();
	}

}
