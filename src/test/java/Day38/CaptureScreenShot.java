package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CaptureScreenShot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1) capture screenshot of full page Screenshot
	/*TakesScreenshot ts=(TakesScreenshot)driver;
	File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	File targetfile=new File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
	sourcefile.renameTo(targetfile);//copy sourcefile to the target location*/
	
		
		//2)  Capture screenshot specific area of the page
	WebElement Featureproduct=driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']//div[@class='item-grid']"));
	File sourcefile=Featureproduct.getScreenshotAs(OutputType.FILE);
	File targetfile=new File(System.getProperty("user.dir")+"\\Screenshot\\Futureproduct.png");
	sourcefile.renameTo(targetfile);
	
	
	//3) capture the screenshot of specific webElement
	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	File sourcefile1=logo.getScreenshotAs(OutputType.FILE);
	File targetfile1=new File(System.getProperty("user.dir")+"\\Screenshot\\logo.png");
	sourcefile1.renameTo(targetfile1);
	
	
	driver.quit();
	}

}
