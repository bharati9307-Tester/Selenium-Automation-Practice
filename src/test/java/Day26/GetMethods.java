package Day26;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		
		// get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle()
		System.out.println(driver.getTitle());//OrangeHRM
		
		//getcurrenturl()
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	    
		
		//getpagesource()
		//System.out.println(driver.getPageSource());
		
		//getwindowhandle()
		String windowid=driver.getWindowHandle();
		System.out.println("Window Id:"+windowid);//Window Id:59C1EDE09DFCAFB6A19F7859890BEF61
		
		
		//getwindowhandles()
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();// this will open new browser window
	   Set<String> windowids=driver.getWindowHandles();
	   System.out.println(windowids); //[29421BC3C50C40377DD24A6C305EB175, D770B7CDDAA63B1FE56F87BE39D52EDA]
	
	}

}
