package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelTest {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String url) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
		case"chrome":driver=new ChromeDriver();
		case"edge":driver=new EdgeDriver();
		case"firefox":driver=new FirefoxDriver();
		default:System.out.println("invalid browser");
		}
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	@Test(priority=1)
	void testlogo()
	{
	 boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(status,true);
	}
	@Test(priority=2)
	void testtitle()
	{
	Assert.assertEquals(driver.getTitle(),"OrangeHRM");	
	}

	@Test(priority=3)
	void testurl()
	{
	Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}


}
