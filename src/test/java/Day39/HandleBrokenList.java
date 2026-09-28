package Day39;


import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
public class HandleBrokenList {

	public static void main(String[] args)  {
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("http://www.deadlinkcity.com/");
    driver.manage().window().maximize();
    
    //capture all the links
    List<WebElement>links=driver.findElements(By.tagName("a"));
    System.out.println("total no of links:"+links.size());
     int noofBrokenlink=0;
    for(WebElement linkElement:links)
    {
    	String hrefattvalue=linkElement.getAttribute("href");
    	if(hrefattvalue==null  || hrefattvalue.isEmpty())
    	{
    		System.out.println("href attribute value is null or empty so not possible to check");
    		continue;
    	}
    	//hit url to server
    	try 
    	{
    	URL linkURL=new URL(hrefattvalue);//converted href value from string to URL format
    	HttpURLConnection conn=(HttpURLConnection)linkURL.openConnection();//open the connection to the server
    	conn.connect();//connect to server and send request the server
    	
    if(	conn.getResponseCode()>=400)
{
	System.out.println(hrefattvalue+"=====>broken link");
	noofBrokenlink++;
}
    else
    {
    	System.out.println(hrefattvalue+"=====>not a broken link");
    }
    	}
    catch(Exception e)
    {
    }
    }
    
  System.out.println("number of broken links:"+noofBrokenlink); //number of broken links:42 
	}

}
