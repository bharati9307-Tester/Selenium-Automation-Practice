package Day24;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
driver.manage().window().maximize();

//Xpath with single attribute
//driver.findElement(By.xpath("//*[@id=\'small-searchterms\']")).sendKeys("T-shirts");
	
	
//Xpath with multiple  attributes
//driver.findElement(By.xpath("//*[@id=\'small-searchterms\'][@placeholder='Search store']")).sendKeys("T-shirts");	

//xpath with and operator
//driver.findElement(By.xpath("//*[@id=\'small-searchterms\'and @placeholder='Search store']")).sendKeys("T-shirts");	
	

//xpath with or operator
driver.findElement(By.xpath("//*[@id=\'small-searchterms\' or @placeholder='Search']")).sendKeys("T-shirts");	


//xpath with inner text using text() method
/*boolean displaystatus =driver.findElement(By.xpath("//button[text()='Search']")).isDisplayed();	
System.out.println(displaystatus);	

String value =driver.findElement(By.xpath("//button[text()='Search']")).getText();	
System.out.println(value);*/

//xpath with contain()
//driver.findElement(By.xpath("//input[contains(@placeholder,'sea')]")).sendKeys("T-shirts");

//xpath with start-with()
//driver.findElement(By.xpath("//input[starts-with(@placeholder,'sea')]")).sendKeys("T-shirts");



	}

}
