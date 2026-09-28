package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
	 ChromeOptions options=new ChromeOptions();
	 options.addArguments("--headless=new");
	 WebDriver d=new ChromeDriver(options);
	 d.get("https://demo.opencart.com/");
	 String act_title=d.getTitle();
	 if(act_title.equals("Your Store"))
	 {
		 System.out.println("test passed");
		 }
	 else
	 {
		 System.out.println("test  failed");
	 }
	 
	 d.quit();
	}

}
