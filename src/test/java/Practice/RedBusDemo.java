package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.redbus.in/");
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //From 
	    d.findElement(By.xpath("//*[@id=\"srcinput\"]")).sendKeys("Mumbai");
	    d.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div")).click();
	    //To
	    d.findElement(By.xpath("//input[@id='destinput']")).sendKeys("Ahmednagar");
	    d.findElement(By.xpath("//div[@aria-label='Ahmednagar']")).click();
       	    
	    //calander
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[1]/div[1]/div[3]/div[1]")).click();
	    d.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[2]/div/div/div/div/ul/div[3]/li[2]/div/div/span")).click();
	    
	    //Search button
	    d.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/button")).click();
	    
	    Thread.sleep(2000);
	    WebElement bus = d.findElement(By.xpath("//*[@id=\"searchContentWrap\"]/div/div[2]/div[4]/div[1]"));
	    
	    System.out.println(bus.getText());

	}

}
