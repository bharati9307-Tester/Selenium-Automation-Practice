package Practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
import java.time.Duration;
//import java.util.Date;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestDemo {
WebDriver driver;
@BeforeClass
void setup()
{
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().window().maximize();
	
	
}
@Test(dataProvider="dp")
void Testlogin(String username,String pwd) throws InterruptedException
{
String beforelogin=("https://practicetestautomation.com/practice-test-login/");
driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
driver.findElement(By.xpath("//button[@id='submit']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();

String Afterlogin = driver.getCurrentUrl();
 if(beforelogin==Afterlogin)
 {
	 System.out.println("Test passed.......");
	//driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
	
 }
else
 {
	 TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshot\\s3.png");
		sourcefile.renameTo(targetfile);
 }

 
Thread.sleep(3000);

}

@AfterClass
void tearDown()
{
driver.quit();	
}
@DataProvider(name="dp")
Object[][] loginData()
{
Object data[][]= {
				         {"bharati","Password123"},
				         {"student","Password123"},
				         };	
return data;
}


}

