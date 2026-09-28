package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		
		
		
	}

}
