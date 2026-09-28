package Day28;

import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowids=driver.getWindowHandles();
		/*//approach 1 to get the id of  individual page using getwindoewshandles()methods
	    List<String> windowlist=new ArrayList(windowids);
	   String parentid= windowlist.get(0);
	   String childid=windowlist.get(1);
	   //switch to child window
	   driver.switchTo().window(childid);
	   System.out.println(driver.getTitle());//Human Resources Management Software | HRMS | OrangeHRM
	   //swittch to parent window
	   driver.switchTo().window(parentid);
	   System.out.println(driver.getTitle());//OrangeHRM*/
		
		
		//approach 2 using loop
		for(String winid:windowids)
		{
			String title=driver.switchTo().window(winid).getTitle();
			  if(title.equals("OrangeHRM"))
			  {
				System.out.println(driver.getCurrentUrl());
				// some validation on the parent window
			  }
			  
		}
	   
	   
	   
	}

}
