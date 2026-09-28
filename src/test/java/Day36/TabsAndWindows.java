package Day36;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.opencart.com/");
		//switch to new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.orangehrm.com/");
		//driver.manage().window().maximize();
	
			
	
	
	
	}

}
