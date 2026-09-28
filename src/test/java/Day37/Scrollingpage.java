package Day37;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver(); 
    driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    JavascriptExecutor js=(JavascriptExecutor)driver;
    
    /*1) scroll the page by given pixel number
    js.executeScript("window.scrollBy(0,1500)", "");
    System.out.println(js.executeScript("return window.pageYOffset;"));*/
    
    
    /*2) scroll the page till element is visible
   WebElement ele= driver.findElement(By.xpath("//h2[normalize-space()='Community poll']"));
    js.executeScript("arguments[0].scrollIntoView();",ele);
    System.out.println(js.executeScript("return window.pageYOffset;"));//2253.333251953125*/
    
    
    //3) scroll page till end of the page
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    System.out.println(js.executeScript("return window.pageYOffset;"));//2382.666748046875
    
    Thread.sleep(5000);
    //4) scrooling up to initial  position
    js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    System.out.println(js.executeScript("return window.pageYOffset;"));//0
    
    
	}

}
