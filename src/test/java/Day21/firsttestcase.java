package Day21;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
/* 
 * test case
 * -----------
 * 1)lauch browser
 * 2)open URL https://demo.openCart.com/
 * 3)validate title should be "Your Store"
 * 4)close browser
 */
public class firsttestcase {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver(); 
	      
	      driver.get("https://kite.zerodha.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.id("userid")).sendKeys("Id");
	      
	   
	   
	  
	   
	   
	   
	   
	   // 4) closing browser
	  // driver.close();
	   //driver.quit();
	   
	      
	}

}
