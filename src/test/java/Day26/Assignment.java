package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		//get methods
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());//Automation Testing Practice
        System.out.println(driver.getCurrentUrl());//https://testautomationpractice.blogspot.com/
        //System.out.println(driver.getPageSource());
        String windowid=driver.getWindowHandle();
        System.out.println("window id:"+windowid);//window id:DC76529874A61317FD466B57ED9787EE
        driver.findElement(By.linkText("merrymoonmary")).click();
        Thread.sleep(5000);
        Set<String> windowids=driver.getWindowHandles();
 	   System.out.println(windowids);//[4251F28673369FE748A8B8B1B0085EDA, 46AACCC4816590F34BD5067BF7920230]

 	   //conditional methods
 	   boolean status=driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isDisplayed();
 	   System.out.println("status of displayed:"+status);//true
 	   boolean enable=driver.findElement(By.xpath("//input[@id='name']\r\n")).isEnabled();
 	   System.out.println("status of enabled:"+enable);//true
 	   boolean  male_rd=driver.findElement(By.xpath("//input[@id='male']")).isSelected();
 	   System.out.println("staus of selected or not :"+male_rd);//false
 	   
 	   // browser method
 	   driver.close();
 	   driver.quit();
	}

}
