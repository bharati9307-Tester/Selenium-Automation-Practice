package Day28;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();	
		//input[@type='submit']
		Thread.sleep(5000);
		List<WebElement>links=driver.findElements(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-results\"]//a"));
		System.out.println("no of links:"+links.size());
		String OriginalWindow=driver.getWindowHandle();
		for(int i=0;i<links.size();i++)
		{
			WebElement link=links.get(i);
			String href=link.getAttribute("href");
			if(href!=null &&href.startsWith("http"))
			{
				
				link.sendKeys(Keys.CONTROL,Keys.ENTER);
				Thread.sleep(5000);
			}
		}
		Thread.sleep(5000);

   Set<String> windowids=driver.getWindowHandles();
   System.out.println("all windows id:");
		for(String winid:windowids)
		{
		
			System.out.println(winid);
		}
		for(String winid:windowids)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			
			if(title.equals("Selenium dioxide - Wikipedia")||title.equals("Selenium (software) - Wikipedia"))
			{
				driver.close();
			}

			
			
	


	}
}
}


